
package mx.shiftf6.controlcyber.modelo;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;

/**
 *
 * @author BarBro
 */
class DetalleModelo {
    //Atributos de Clase
    private IntegerProperty detalleEvento;
    private ObjectProperty<LocalDate> entrada;
    private ObjectProperty<LocalDate> salida;
    
    public DetalleModelo(){
        //Default Constructor
    }
    //Get and Set Methods for DetalleModelo Class
    //detalleEvento
    public int getsDetalleEvento(){
        return detalleEvento.get();
    }
    public void setDetalleEvento(int detalleEvento){
        this.detalleEvento.set(detalleEvento);
    }
    public IntegerProperty detalleEventoProperty(){
        return detalleEvento;
    }
    //entrada
    public LocalDate getEntrada(){
        return entrada.get();
    }
    public void setEntrada(LocalDate entrada){
        this.entrada.set(entrada);
    }
    public ObjectProperty<LocalDate> entradaProperty(){
        return entrada;
    } 
    //salida
    public LocalDate getSalida(){
        return salida.get();
    }
    public void setSalida(LocalDate salida){
        this.salida.set(salida);
    }
    public ObjectProperty<LocalDate> salidaProperty(){
        return salida;
    } 
    
    //Other methods
    //toString
    public String toString(String text){
        return text;
    }
    //toArray
    public String[] toArray(String[] textArray){
        return textArray;
    }
    
    
}
