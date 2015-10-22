
package mx.shiftf6.controlcyber.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import mx.shiftf6.controlcyber.utilerias.ConnectionDB;
import mx.shiftf6.controlcyber.utilerias.HoraFecha;
import mx.shiftf6.controlcyber.utilerias.LeerArchivo;
import mx.shiftf6.controlcyber.utilerias.Notificacion;

/**
 *
 * @author BarBro
 */
public class BitacoraDAO implements ObjetoDAO{
    
    private final Connection conexion;
    public static final int NO_MENSAJES = -1;
    public static final int CREDENCIALES_VALIDAS = 0;
    public static final int USUARIO_INCORRECTO = 1;
    public static final int CONTRASENA_INCORRECTA = 2;
    public static final int USUARIO_BLOQUEADO = 3;
    public static final int ERROR_SQL = 4;
    
    public BitacoraDAO(){
        LeerArchivo.leerArchivo();
        ConnectionDB conexionDB = new ConnectionDB(LeerArchivo.nameDB, LeerArchivo.hostDB, LeerArchivo.userDB, LeerArchivo.passwordDB);
        conexion = conexionDB.conectarMySQL();
    }// Fin constructor

    @Override
    public void crear(Object obj) {
        BitacoraModelo bitacora = (BitacoraModelo) obj;
        String crearRegistro = "INSERT INTO bitacora VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement declaracion = conexion.prepareStatement(crearRegistro);
            declaracion.setDouble(1, bitacora.getCveBitacora());
            declaracion.setString(2, bitacora.getUsuarioModelo().getNombreUsuario());
            declaracion.setString(3, HoraFecha.formatFecha(bitacora.getFecha()));
            declaracion.setInt(4, bitacora.getEquipoModelo().getCveEquipo());
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
