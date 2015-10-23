
package mx.shiftf6.controlcyber.vista;

import java.time.LocalTime;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import mx.shiftf6.controlcyber.ControlCyber;
import mx.shiftf6.controlcyber.utilerias.ControlTiempoCosto;
import mx.shiftf6.controlcyber.utilerias.Notificacion;

/**
 *
 * @author Champe
 */
public class VentanaControl {
    
    @FXML
    private TextField tiempo;
    @FXML
    private TextField costo;
    @FXML
    private Button cobrar;
    
    ControlCyber controlCyber;
    ControlTiempoCosto controlTiempoCosto;
    
    @FXML                                                                   
    private void initialize() {
        iniciarComponentes();
        controlarTiempo();
    }
    
    public void setControlCyber(ControlCyber controlCyber) {
        this.controlCyber = controlCyber;
    }
    
    public void iniciarComponentes() {
        Image iconoCobrar = new Image("file:recursos/imagenes/iconos/Untitled-1-04.png");
        this.cobrar.setGraphic(new ImageView(iconoCobrar));
    }
    
    public void controlarTiempo() {
        controlTiempoCosto = new ControlTiempoCosto(LocalTime.now(), tiempo, costo);
        Thread control = new Thread(controlTiempoCosto);
        control.start();
    }
    
    @FXML
    public void cerrarSesion() {
        boolean opcion = Notificacion.dialogoPreguntar("Cerrar Sesión", "¡Estas seguro de cerrar la sesión?");
        if (opcion) {
            controlTiempoCosto.setActivarTemporizador(false);
            controlCyber.mostrarPantallaUno();
        }//Fin fi        
    }// Fin método
    
}// Fin clase
