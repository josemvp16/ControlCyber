
package mx.shiftf6.controlcyber.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import mx.shiftf6.controlcyber.utilerias.ConnectionDB;
import mx.shiftf6.controlcyber.utilerias.HoraFecha;
import mx.shiftf6.controlcyber.utilerias.LeerArchivo;
import mx.shiftf6.controlcyber.utilerias.Notificacion;

/**
 *
 * @author BarBro
 */
public class ClienteDAO implements ObjetoDAO{
    
    private final Connection conexion;
    public static final int NO_MENSAJES = -1;
    public static final int CREDENCIALES_VALIDAS = 0;
    public static final int USUARIO_INCORRECTO = 1;
    public static final int CONTRASENA_INCORRECTA = 2;
    public static final int USUARIO_BLOQUEADO = 3;
    public static final int ERROR_SQL = 4;
    
    public ClienteDAO(){
        LeerArchivo.leerArchivo();
        ConnectionDB conexionDB = new ConnectionDB(LeerArchivo.nameDB, LeerArchivo.hostDB, LeerArchivo.userDB, LeerArchivo.passwordDB);
        conexion = conexionDB.conectarMySQL();
    }// Fin constructor
    
    // Get and Set Methods for ClienteDAO Class
    // ClienteModelo
    //public ClienteModelo getClienteModelo(){
    //    return this.clienteModelo;
    //}
    //public void setClienteModelo(ClienteModelo clienteModelo){
    //    this.clienteModelo = clienteModelo;
    //}

    @Override
    public void crear(Object obj) {
        ClienteModelo cliente = (ClienteModelo) obj;
        String crearRegistro = "INSERT INTO clientes VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement declaracion = conexion.prepareStatement(crearRegistro);
            declaracion.setInt(1, cliente.getCveCliente());
            declaracion.setString(2, cliente.getPrimerNombre());
            declaracion.setString(3, cliente.getSegundoNombre());
            declaracion.setString(4, cliente.getPrimerApellido());
            declaracion.setString(5, cliente.getSegundoApellido());
            declaracion.setString(6, cliente.getSexo());
            declaracion.setString(7, cliente.getColonia());
            declaracion.setString(8, cliente.getMunicipio());
            declaracion.setString(9, cliente.getEstado());
            declaracion.setInt(10, cliente.getTelefono());
            declaracion.setString(11, cliente.getCorreoElectronico());
            declaracion.execute();
            Notificacion.dialogoAlerta(Alert.AlertType.CONFIRMATION, "Base de Datos", "El registro se creo correctamente");
        } catch (SQLException sqle) {
            Notificacion.dialogoException(sqle);
        }// Fin try/catch
    }// Fin método

    @Override
    public Object leerUno(String campo, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] leerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int cerrarConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
