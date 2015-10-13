
package mx.shiftf6.controlcyber.modelo;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;

/**
 *
 * @author BarBro
 */
public class BitacoraModelo {
    //Atributos de Clase
    private IntegerProperty cveBitacora;
    private UsuarioModelo usuarioModelo;
    private ObjectProperty<LocalDate> fecha;
    private EquipoModelo equipoModelo;
    private DetalleModelo detalleModelo;
        
    public BitacoraModelo(){
        //Default Constructor
    }
    //Get and Set Methods for BitacoraModelo Class
    //cveCliente
    public int getCveBitacora(){
        return cveBitacora.get();
    }
    public void setCveBitacora(int cveBitacora){
        this.cveBitacora.set(cveBitacora);
    }
    public IntegerProperty cveBitacoraProperty(){
        return cveBitacora;
    }
    //usuarioModelo
    public void getUsuarioModelo(){
        usuarioModelo.getClass();
    }
    public void setUsuarioModelo(UsuarioModelo usuarioModelo){
        this.usuarioModelo.equals(usuarioModelo);
    }
    //fecha
    public LocalDate getFecha(){
        return fecha.get();
    }
    public void setFecha(LocalDate fecha){
        this.fecha.set(fecha);
    }
    public ObjectProperty<LocalDate> fechaProperty(){
        return fecha;
    } 
    //equipoModelo
    public void getEquipoModelo(){
        equipoModelo.getClass();
    }
    public void setEquipoModelo(EquipoModelo equipoModelo){
        this.equipoModelo.equals(equipoModelo);
    }
    //detalleModelo
    public void getDetalleModelo(){
        detalleModelo.getClass();
    }
    public void setDetalleModelo(DetalleModelo detalleModelo){
        this.detalleModelo.equals(detalleModelo);
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
