
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
    //Get and Set Methods for ClienteModelo Class
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
    
}
