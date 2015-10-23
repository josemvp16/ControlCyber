
package mx.shiftf6.controlcyber.modelo;

import java.time.LocalTime;
import java.util.ArrayList;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author BarBro
 */
public class DetalleBitacoraModelo {
    // Atributos de Clase
    private BitacoraModelo bitacoraModelo;
    private ObjectProperty<LocalTime> hora;
    private StringProperty evento;
    
    public DetalleBitacoraModelo(){
        // Default Constructor
    }
    // Get and Set Methods for DetalleBitacoraModelo Class
    // bitacoraModelo
    public BitacoraModelo getBitacoraModelo(){
        return bitacoraModelo;
    }
    public void setBitacoraModelo(BitacoraModelo bitacoraModelo){
        this.bitacoraModelo = bitacoraModelo;
    }
    // Hora
    public LocalTime getHora(){
        return hora.get();
    }
    public void setEntrada(LocalTime hora){
        this.hora.set(hora);
    }
    public ObjectProperty<LocalTime> entradaProperty(){
        return hora;
    } 
    // Evento
    public String getEvento(){
        return evento.get();
    }
    public void setEvento(String evento){
        this.evento.set(evento);
    }
    public StringProperty eventoProperty(){
        return evento;
    } 
    
    // Other Methods
    // ToString
    @Override
    public String toString(){
        String text = "Clave Bitacora : " + getBitacoraModelo().getCveBitacora() + "\n" +
                      "Hora: " + getHora() + "\n" +
                      "Evento: " + getEvento() + "\n";
        
        return text;
    }
    // ToArray
    public ArrayList toArray(){
        ArrayList<Object> arreglo = new ArrayList<>();
        arreglo.add(getBitacoraModelo());
        arreglo.add(getHora());
        arreglo.add(getEvento());
        
        return arreglo;
    }
    
    
}
