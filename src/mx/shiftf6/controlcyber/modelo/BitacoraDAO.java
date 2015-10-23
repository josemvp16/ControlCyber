
package mx.shiftf6.controlcyber.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import mx.shiftf6.controlcyber.utilerias.ConnectionDB;
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
    public boolean crear(Object obj) {
        BitacoraModelo bitacora = (BitacoraModelo) obj;
        String crearRegistro = "INSERT INTO bitacora (nombreUsuario, fecha, cveEquipo) VALUES (?, CURDATE(), ?)";
        try {
            PreparedStatement declaracion = conexion.prepareStatement(crearRegistro);
            declaracion.setString(1, bitacora.getUsuarioModelo().getNombreUsuario());
            declaracion.setString(2, bitacora.getEquipoModelo().getCveEquipo());
            declaracion.execute();
            return true;
            //Notificacion.dialogoAlerta(Alert.AlertType.CONFIRMATION, "Base de Datos [Bitacora]", "El registro se creo correctamente");
        } catch (SQLException sqle) {
            Notificacion.dialogoException(sqle);
            return false;
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
        try{
            System.out.println("Cerrar Conexion OK");
            this.conexion.close();
            return BitacoraDAO.NO_MENSAJES;
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return BitacoraDAO.ERROR_SQL;
        }// Fin try/catch
    }// Fin método
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Long obtenerUltimoRegistro() {
        String buscarRegistro = "SELECT * FROM bitacora ORDER BY cveBitacora DESC LIMIT 1";
        try {
            Statement declaracion = conexion.createStatement();
            ResultSet resultado = declaracion.executeQuery(buscarRegistro);
            if (resultado.next())
                return resultado.getLong("cveBitacora") + 1;
            else
                return null;
            //Notificacion.dialogoAlerta(Alert.AlertType.CONFIRMATION, "Base de Datos [Bitacora]", "El registro se creo correctamente");
        } catch (SQLException sqle) {
            Notificacion.dialogoException(sqle);
            return null;
        }// Fin try/catch
    }

}
