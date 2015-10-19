
package mx.shiftf6.controlcyber.utilerias;
import java.sql.Connection;


public class testConexion {    
    
    public static void main(String[] args) {
        LeerArchivo leer=new LeerArchivo("/mx/shiftf6/controlcyber/archivos");
        ConnectionDB conectar = new ConnectionDB(leer.getNameDB(), leer.getHostDB(), leer.getUserDB(), leer.getPasswordDB());
        Connection conexion = conectar.conectarMySQL();
        conectar.terminarConexion();
    }
    
    
}

