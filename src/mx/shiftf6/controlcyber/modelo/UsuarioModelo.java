
package mx.shiftf6.controlcyber.modelo;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author BarBro
 */
class UsuarioModelo {
    //Atributos de Clase
    private StringProperty nombreUsuario;
    private ObjectProperty<LocalDate> fechaRegistro;
    private StringProperty contrasena;
    private IntegerProperty status;
    private ClienteModelo clienteModelo;
    
    public UsuarioModelo(){
        //Default Constructor
    }
    //Get and Set Methods for UsuarioModelo Class
    //nombreUsuario
    public String getNombreUsuario(){
        return nombreUsuario.get();
    }
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario.set(nombreUsuario);
    }
    public StringProperty nombreUsuarioProperty(){
        return nombreUsuario;
    }
    //fechaRegistro
    public LocalDate getFechaRegistro(){
        return fechaRegistro.get();
    }
    public void setFechaRegistro(LocalDate fechaRegistro){
        this.fechaRegistro.set(fechaRegistro);
    }
    public ObjectProperty<LocalDate> fechaRegistroProperty(){
        return fechaRegistro;
    } 
    //contrasena
    public String getContrasena(){
        return contrasena.get();
    }
    public void setContrasena(String contrasena){
        this.contrasena.set(contrasena);
    }
    public StringProperty contrasenaProperty(){
        return contrasena;
    }
    //status
    public int getsSatus(){
        return status.get();
    }
    public void setStatus(int status){
        this.status.set(status);
    }
    public IntegerProperty statusProperty(){
        return status;
    }
    //clienteModelo
    public void getClienteModelo(){
        clienteModelo.getClass();
    }
    public void setClienteModelo(ClienteModelo clienteModelo){
        this.clienteModelo.equals(clienteModelo);
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
