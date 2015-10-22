
package mx.shiftf6.controlcyber.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;

/**
 *
 * @author BarBro
 */
public class BitacoraModelo {
    // Atributos de Clase
    private DoubleProperty cveBitacora;
    private UsuarioModelo usuarioModelo;
    private ObjectProperty<LocalDate> fecha;
    private EquipoModelo equipoModelo;
    private DetalleModelo detalleModelo;
        
    public BitacoraModelo(){
        // Default Constructor
    }
    // Get and Set Methods for BitacoraModelo Class
    // CveCliente
    public Double getCveBitacora(){
        return cveBitacora.get();
    }
    public void setCveBitacora(int cveBitacora){
        this.cveBitacora.set(cveBitacora);
    }
    public DoubleProperty cveBitacoraProperty(){
        return cveBitacora;
    }
    // UsuarioModelo
    public UsuarioModelo getUsuarioModelo(){
        return this.usuarioModelo;
    }
    public void setUsuarioModelo(UsuarioModelo usuarioModelo){
        this.usuarioModelo = usuarioModelo;
    }
    // Fecha
    public LocalDate getFecha(){
        return fecha.get();
    }
    public void setFecha(LocalDate fecha){
        this.fecha.set(fecha);
    }
    public ObjectProperty<LocalDate> fechaProperty(){
        return fecha;
    } 
    // EquipoModelo
    public EquipoModelo getEquipoModelo(){
        return this.equipoModelo;
    }
    public void setEquipoModelo(EquipoModelo equipoModelo){
        this.equipoModelo = equipoModelo;
    }
    // DetalleModelo
    public DetalleModelo getDetalleModelo(){
        return this.detalleModelo;
    }
    public void setDetalleModelo(DetalleModelo detalleModelo){
        this.detalleModelo = detalleModelo;
    }
    
    // Other methods
    // ToString
    @Override
    public String toString(){
        String text = "Clave Bitacora: " + this.getCveBitacora() + "\n" +
                      "Usuario: " + this.getUsuarioModelo() + "\n" +
                      "Fecha: " + this.getFecha() + "\n" +
                      "Equipo: " + this.getEquipoModelo() + "\n" +
                      "Detalle: " + this.getDetalleModelo() + "\n";
        
        return text;
    }
    // ToArray
    public ArrayList toArray(){
        ArrayList<Object> arreglo = new ArrayList<>();
        arreglo.add(this.getCveBitacora());
        arreglo.add(this.getUsuarioModelo());
        arreglo.add(this.getFecha());
        arreglo.add(this.getEquipoModelo());
        arreglo.add(this.getDetalleModelo());
        
        return arreglo;
    }
}
