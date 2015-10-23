
package mx.shiftf6.controlcyber.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;

/**
 *
 * @author BarBro
 */
public class BitacoraModelo {
    // Atributos de Clase
    private final LongProperty cveBitacora;
    private UsuarioModelo usuarioModelo;
    private final ObjectProperty<LocalDate> fecha;
    private EquipoModelo equipoModelo;
        
    public BitacoraModelo(Long cveBitacora, UsuarioModelo usuarioModelo, LocalDate fecha, EquipoModelo equipoModelo){
        this.cveBitacora = new SimpleLongProperty(cveBitacora);
        this.usuarioModelo = usuarioModelo;
        this.fecha = new SimpleObjectProperty(fecha);
        this.equipoModelo = equipoModelo;
    }// Fin constructor
    
    // Get and Set Methods for BitacoraModelo Class
    // CveCliente
    public Long getCveBitacora(){
        return cveBitacora.get();
    }
    public void setCveBitacora(int cveBitacora){
        this.cveBitacora.set(cveBitacora);
    }
    public LongProperty cveBitacoraProperty(){
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
    
    // Other methods
    // ToString
    @Override
    public String toString(){
        String text = "Clave Bitacora: " + this.getCveBitacora() + "\n" +
                      "Usuario: " + this.getUsuarioModelo() + "\n" +
                      "Fecha: " + this.getFecha() + "\n" +
                      "Equipo: " + this.getEquipoModelo();
        
        return text;
    }
    // ToArray
    public ArrayList toArray(){
        ArrayList<Object> arreglo = new ArrayList<>();
        arreglo.add(this.getCveBitacora());
        arreglo.add(this.getUsuarioModelo());
        arreglo.add(this.getFecha());
        arreglo.add(this.getEquipoModelo());
        
        return arreglo;
    }
}
