
package mx.shiftf6.controlcyber.utilerias;
import mx.shiftf6.controlcyber.utilerias.ConnectionDB;
import mx.shiftf6.controlcyber.utilerias.LeerArchivo;
import java.sql.Connection;


public class testConexion {    
    
    public static void main(String[] args) {
        LeerArchivo leer=new LeerArchivo("/mx/shiftf6/controlcyber/archivos");
        ConnectionDB conectar = new ConnectionDB(leer.getNameDB(), leer.getHostDB(), leer.getUserDB(), leer.getPasswordDB());
        Connection conexion = conectar.conectarMYSQL();
        conectar.terminarConexion();
        
    
    }
    
    
}

