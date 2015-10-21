
package mx.shiftf6.controlcyber.utilerias;

import java.awt.Toolkit;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class LeerArchivo {
    
    //VARIABLES
    private static List<String> content;
    public static String nameDB;
    public static String hostDB;
    public static String userDB;
    public static String passwordDB;
    
    public static void leerArchivo(){
        try{
            String ruta = "E:/ConnectionData.dat";
            System.out.println(ruta);
            LeerArchivo.content = Files.readAllLines(Paths.get(ruta));
            LeerArchivo.nameDB = content.get(2);
            LeerArchivo.hostDB = content.get(4);
            LeerArchivo.userDB = content.get(6);
            LeerArchivo.passwordDB = content.get(8);
        }catch(IOException ioe){
            Toolkit.getDefaultToolkit().beep();
            //Notificacion notificacion = new Notificacion(AlertTipe.CONFIRMATION);
            //notificacion.setTitulo("Titulo");
           // notificacion.setCabecera("Cabecera");
           // notificacion.setMensaje("Mensaje");
            //notificacion.getAlerta().showandwait();
            
        }
    }
    
    /**
     *
     * @return
     */
    public static String aCadena() {
        String datos = "Base de Datos: " + nameDB + "\n"
                + "Host: " + hostDB + "\n"
                + "Usuario: " + userDB + "\n"
                + "Contraseña: " + passwordDB;
        return datos;
    }

    
    
}
