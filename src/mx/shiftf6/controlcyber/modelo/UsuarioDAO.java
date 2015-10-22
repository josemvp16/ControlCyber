
package mx.shiftf6.controlcyber.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mx.shiftf6.controlcyber.utilerias.ConnectionDB;
import mx.shiftf6.controlcyber.utilerias.LeerArchivo;

/**
 *
 * @author Champe
 */
public class UsuarioDAO implements ObjetoDAO{

    private final Connection conexion;
    public static final int NO_MENSAJES = -1;
    public static final int CREDENCIALES_VALIDAS = 0;
    public static final int USUARIO_INCORRECTO = 1;
    public static final int CONTRASENA_INCORRECTA = 2;
    public static final int USUARIO_BLOQUEADO = 3;
    public static final int ERROR_SQL = 4;
    
    public UsuarioDAO() {
        LeerArchivo.leerArchivo();
        ConnectionDB conexionDB = new ConnectionDB(LeerArchivo.nameDB, LeerArchivo.hostDB, LeerArchivo.userDB, LeerArchivo.passwordDB);
        conexion = conexionDB.conectarMySQL();
    }// Fin constructor
    
    @Override
    public void crear(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        try{
            System.out.println("Cerrar Conexion OK");
            this.conexion.close();
            return UsuarioDAO.NO_MENSAJES;
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return UsuarioDAO.ERROR_SQL;
        }// Fin try/catch
    }// Fin método
    
    public int buscarUsuario(UsuarioModelo usuario) {
        String buscarNombreUsuario = "SELECT * FROM usuarios WHERE nombreUsuario = ?";
        String buscarNombreContrasenaUsuario = "SELECT * FROM usuarios WHERE nombreUsuario = ? AND contrasena = ?";
        String buscarNombreContrasenaEstadoUsuario = "SELECT * FROM usuarios WHERE nombreUsuario = ? AND contrasena = ? AND status = 1";
        try{
            PreparedStatement declaracion = conexion.prepareStatement(buscarNombreUsuario);
            declaracion.setString(1, usuario.getNombreUsuario());
            ResultSet resultado = declaracion.executeQuery();
            if (resultado.next()) {
                declaracion = conexion.prepareStatement(buscarNombreContrasenaUsuario);
                declaracion.setString(1, usuario.getNombreUsuario());
                declaracion.setString(2, usuario.getContrasena());
                resultado = declaracion.executeQuery();
                if (resultado.next()) {
                    declaracion = conexion.prepareStatement(buscarNombreContrasenaEstadoUsuario);
                    declaracion.setString(1, usuario.getNombreUsuario());
                    declaracion.setString(2, usuario.getContrasena());
                    resultado = declaracion.executeQuery();
                    if (resultado.next()) {
                        return UsuarioDAO.CREDENCIALES_VALIDAS;
                    }else {
                        return UsuarioDAO.USUARIO_BLOQUEADO;
                    }// Fin if/else
                } else {
                    return UsuarioDAO.CONTRASENA_INCORRECTA;
                }// Fin if/else
            } else {
                return UsuarioDAO.USUARIO_INCORRECTO;
            }// Fin if/else
        } catch (SQLException sqle) {
            return UsuarioDAO.ERROR_SQL;
        }// Fin try/catch
    }// Fin método
        
}// Fin clase
