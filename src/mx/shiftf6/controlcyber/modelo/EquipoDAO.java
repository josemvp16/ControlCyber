
package mx.shiftf6.controlcyber.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import mx.shiftf6.controlcyber.utilerias.ConnectionDB;
import mx.shiftf6.controlcyber.utilerias.LeerArchivo;
import mx.shiftf6.controlcyber.utilerias.Notificacion;

/**
 *
 * @author BarBro
 */
public class EquipoDAO implements ObjetoDAO{
    // Atributos de Clase
    private final Connection conexion;
    public static final int NO_MENSAJES = -1;
    public static final int CREDENCIALES_VALIDAS = 0;
    public static final int USUARIO_INCORRECTO = 1;
    public static final int CONTRASENA_INCORRECTA = 2;
    public static final int USUARIO_BLOQUEADO = 3;
    public static final int ERROR_SQL = 4;
    
    public EquipoDAO(){
        LeerArchivo.leerArchivo();
        ConnectionDB conexionDB = new ConnectionDB(LeerArchivo.nameDB, LeerArchivo.hostDB, LeerArchivo.userDB, LeerArchivo.passwordDB);
        conexion = conexionDB.conectarMySQL();
    }// Fin constructor
    
    // Get and Set Methods for EquipoDAO Class
    // EquipoModelo
    //public EquipoModelo getEquipoModelo(){
    //    return this.equipoModelo;
    //}
    //public void setEquipoModelo(EquipoModelo equipoModelo){
    //    this.equipoModelo = equipoModelo;
    //}

    @Override
    public Object[] leerUno(String campo, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] leerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crear(Object obj) {
        
    }// Fin método

    @Override
    public void eliminar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int cerrarConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
