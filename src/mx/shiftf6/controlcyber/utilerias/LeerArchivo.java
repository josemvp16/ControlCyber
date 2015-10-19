
package mx.shiftf6.controlcyber.utilerias;

import java.awt.Toolkit;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import mx.shiftf6.controlcyber.ControlCyber;


public class LeerArchivo {
    
    //VARIABLES
    private List <String> content;
    private String nameDB;
    private String hostDB;
    private String userDB;
    private String passwordDB;
    
    public LeerArchivo(){
        try{
            String ruta = "E:/ConnectionData.dat";
            System.out.println(ruta);
            this.content = Files.readAllLines(Paths.get(ruta));
            this.nameDB = content.get(2);
            this.hostDB = content.get(4);
            this.userDB = content.get(6);
            this.passwordDB = content.get(8);
        }catch(IOException ioe){
            Toolkit.getDefaultToolkit().beep();
            //Notificacion notificacion = new Notificacion(AlertTipe.CONFIRMATION);
            //notificacion.setTitulo("Titulo");
           // notificacion.setCabecera("Cabecera");
           // notificacion.setMensaje("Mensaje");
            //notificacion.getAlerta().showandwait();
            
        }
    }
    
    @Override
    public String toString() {
        String datos = "Base de Datos: " + nameDB + "\n"
                + "Host: " + hostDB + "\n"
                + "Usuario: " + userDB + "\n"
                + "Contraseña: " + passwordDB;
        return datos;
    }

    public String getNameDB() {
        return nameDB;
    }

    public String getHostDB() {
        return hostDB;
    }

    public String getUserDB() {
        return userDB;
    }

    public String getPasswordDB() {
        return passwordDB;
    }
    
    
}
