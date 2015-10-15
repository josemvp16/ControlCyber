
package mx.shiftf6.controlcyber.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author BarBro
 */
public class UsuarioModelo {
    // Atributos de Clase
    private StringProperty nombreUsuario;
    private ObjectProperty<LocalDate> fechaRegistro;
    private StringProperty contrasena;
    private IntegerProperty status;
    private ClienteModelo clienteModelo;
    
    public UsuarioModelo(){
        this.nombreUsuario = null;
        this.contrasena = null;
        this.fechaRegistro = null;
        this.status = null;
        this.clienteModelo = null;
    }
    public UsuarioModelo(StringProperty usuario, StringProperty contrasena) {
        
    }
    // Get and Set Methods for UsuarioModelo Class
    // NombreUsuario
    public String getNombreUsuario(){
        return nombreUsuario.get();
    }
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario.set(nombreUsuario);
    }
    public StringProperty nombreUsuarioProperty(){
        return nombreUsuario;
    }
    // FechaRegistro
    public LocalDate getFechaRegistro(){
        return fechaRegistro.get();
    }
    public void setFechaRegistro(LocalDate fechaRegistro){
        this.fechaRegistro.set(fechaRegistro);
    }
    public ObjectProperty<LocalDate> fechaRegistroProperty(){
        return fechaRegistro;
    } 
    // Contrasena
    public String getContrasena(){
        return contrasena.get();
    }
    public void setContrasena(String contrasena){
        this.contrasena.set(contrasena);
    }
    public StringProperty contrasenaProperty(){
        return contrasena;
    }
    // Status
    public int getsSatus(){
        return status.get();
    }
    public void setStatus(int status){
        this.status.set(status);
    }
    public IntegerProperty statusProperty(){
        return status;
    }
    // ClienteModelo
    public ClienteModelo getClienteModelo(){
        return this.clienteModelo;
    }
    public void setClienteModelo(ClienteModelo clienteModelo){
        this.clienteModelo = clienteModelo;
    }
    
    // ToString
    @Override
    public String toString(){
        String text = "Nombre Usuario: " + this.getNombreUsuario() + "\n" +
                      "Fecha Registro: " + this.getFechaRegistro() + "\n" +
                      "Contraseña: " + this.getContrasena() + "\n" +
                      "Status: " + this.getsSatus() + "\n" +
                      "Cliente: " + this.getClienteModelo() + "\n";
        
        return text;
    }
    // ToArray
    public ArrayList toArray(){
        ArrayList<Object> arreglo = new ArrayList();
        arreglo.add(this.getNombreUsuario());
        arreglo.add(this.getFechaRegistro());
        arreglo.add(this.getContrasena());
        arreglo.add(this.getsSatus());
        arreglo.add(this.getClienteModelo());
        
        return arreglo;
    }
}
