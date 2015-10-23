
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
public class DetalleBitacoraDAO implements ObjetoDAO{
    
    private final Connection conexion;
    public static final int NO_MENSAJES = -1;
    public static final int CREDENCIALES_VALIDAS = 0;
    public static final int USUARIO_INCORRECTO = 1;
    public static final int CONTRASENA_INCORRECTA = 2;
    public static final int USUARIO_BLOQUEADO = 3;
    public static final int ERROR_SQL = 4;
    
    public DetalleBitacoraDAO(){
        LeerArchivo.leerArchivo();
        ConnectionDB conexionDB = new ConnectionDB(LeerArchivo.nameDB, LeerArchivo.hostDB, LeerArchivo.userDB, LeerArchivo.passwordDB);
        conexion = conexionDB.conectarMySQL();
    }// Fin constructor

    @Override
    public void crear(Object obj) {
        DetalleBitacoraModelo bitacoraDetalle = (DetalleBitacoraModelo) obj;
        String crearRegistro = "INSERT INTO detalleBitacora (cveBitacora, hora, evento) VALUES (?, CURTIME(), ?)";
        try {
            PreparedStatement declaracion = conexion.prepareStatement(crearRegistro);
            declaracion.setLong(1, bitacoraDetalle.getBitacoraModelo().getCveBitacora());
            declaracion.setString(2, bitacoraDetalle.getEvento());
            declaracion.execute();
            Notificacion.dialogoAlerta(Alert.AlertType.CONFIRMATION, "Base de Datos [DetalleBitacora]", "El registro se creo correctamente");
        } catch (SQLException sqle) {
            Notificacion.dialogoException(sqle);
        }// Fin try/catch
    }

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
