
package mx.shiftf6.controlcyber.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;

/**
 *
 * @author BarBro
 */
public class DetalleModelo {
    // Atributos de Clase
    private IntegerProperty detalleEvento;
    private ObjectProperty<LocalDate> entrada;
    private ObjectProperty<LocalDate> salida;
    
    public DetalleModelo(){
        // Default Constructor
    }
    // Get and Set Methods for DetalleModelo Class
    // DetalleEvento
    public int getsDetalleEvento(){
        return detalleEvento.get();
    }
    public void setDetalleEvento(int detalleEvento){
        this.detalleEvento.set(detalleEvento);
    }
    public IntegerProperty detalleEventoProperty(){
        return detalleEvento;
    }
    // Entrada
    public LocalDate getEntrada(){
        return entrada.get();
    }
    public void setEntrada(LocalDate entrada){
        this.entrada.set(entrada);
    }
    public ObjectProperty<LocalDate> entradaProperty(){
        return entrada;
    } 
    // Salida
    public LocalDate getSalida(){
        return salida.get();
    }
    public void setSalida(LocalDate salida){
        this.salida.set(salida);
    }
    public ObjectProperty<LocalDate> salidaProperty(){
        return salida;
    } 
    
    // Other Methods
    // ToString
    @Override
    public String toString(){
        String text = "Detalle Evento: " + this.getsDetalleEvento() + "\n" +
                      "Entrada: " + this.getEntrada() + "\n" +
                      "Salida: " + this.getSalida() + "\n";
        
        return text;
    }
    // ToArray
    public ArrayList toArray(){
        ArrayList<Object> arreglo = new ArrayList();
        arreglo.add(this.getsDetalleEvento());
        arreglo.add(this.getEntrada());
        arreglo.add(this.getSalida());
        
        return arreglo;
    }
    
    
}
