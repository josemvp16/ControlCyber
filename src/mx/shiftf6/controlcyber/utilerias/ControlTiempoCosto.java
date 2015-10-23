
package mx.shiftf6.controlcyber.utilerias;

import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.MINUTES;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.control.TextField;

/**
 *
 * @author Champe
 */
public class ControlTiempoCosto implements Runnable{
    
    private final ObjectProperty<LocalTime> tiempo;
    private final DoubleProperty costo;
    private final LongProperty minutos;
    private boolean activarTemporizador;
    private final TextField campoTiempo, campoCosto;
    
    public ControlTiempoCosto(LocalTime tiempo, TextField campoTiempo, TextField campoCosto) {
        this.tiempo = new SimpleObjectProperty(LocalTime.of(tiempo.getHour(), tiempo.getMinute(), tiempo.getSecond()));
        this.campoTiempo = campoTiempo;
        this.campoCosto = campoCosto;
        minutos = new SimpleLongProperty(0);
        costo = new SimpleDoubleProperty(2.00);
        activarTemporizador = true;
    }// Fin constructor

    @Override
    public void run() {
        int aumentarCosto;
        while(activarTemporizador) {
            try {
                Thread.sleep(60000);
                minutos.set(MINUTES.between(tiempo.get(), LocalTime.now()));
                aumentarCosto = (int)minutos.get() % 15;
                if(aumentarCosto == 0) {
                    costo.set(costo.get() + 2.00);
                }// Fin if
                campoTiempo.setText(""+minutos.get() + "Min.");
                campoCosto.setText(""+costo.get());
            } catch (InterruptedException ie) {
                Notificacion.dialogoException(ie);
            }// Fin try/catch
        }// Fin while
    }// Fin método
    
    public void setTiempo(LocalTime tiempo) {
        this.tiempo.set(tiempo);
    }// Fin método
    
    public LocalTime getTiempo() {
        return tiempo.get();
    }// Fin método
    
    public ObjectProperty<LocalTime> getTiempoProperty() {
        return tiempo;
    }// FIn método
    
    public void setCosto(double costo) {
        this.costo.set(costo);
    }// Fin método
    
    public double getCosto() {
        return costo.get();
    }// Fin método
    
    public DoubleProperty getCostoProperty() {
        return costo;
    }// Fin método
    
    public void setMinutos(long minutos) {
        this.minutos.set(minutos);
    }// Fin método
    
    public long getMinutos() {
        return minutos.get();
    }// Fin método
    
    public LongProperty getCMinutosProperty() {
        return minutos;
    }// Fin método
    
    public void setActivarTemporizador(boolean activarTemporizador) {
        this.activarTemporizador = activarTemporizador;
    }// Fin método
    
    public boolean getActivarTemporizador() {
        return activarTemporizador;
    }// Fin método
    
}// Fin clase
