
package mx.shiftf6.controlcyber.vista;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import mx.shiftf6.controlcyber.ControlCyber;

/**
 *
 * @author Champe
 */
public class Pantalla1Control {
    
    @FXML
    private Button botonEntrar;
    
    private ControlCyber controlCyber;
    
    public Pantalla1Control() {
        
    }// Fin constructor
    
    @FXML
    private void initialize() {
        
    }
    
    /**
     *  Es llamado por la aplicación principal para referencia del mismo
     * 
     * @param controlCyber
     */
    public void setControlCyber(ControlCyber controlCyber) {
        this.controlCyber = controlCyber;
    }
    
    /**
     * Llamado cuando el usuario da click sobre el boton de entrar
     */
    @FXML
    private void mostrarPantallaSesion() {
        this.controlCyber.mostrarPantallaDos();
    }
    
}