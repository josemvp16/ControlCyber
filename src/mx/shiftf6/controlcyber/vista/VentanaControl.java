
package mx.shiftf6.controlcyber.vista;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import mx.shiftf6.controlcyber.ControlCyber;

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
    private ImageView minimizar;
    @FXML
    private Button cobrar;
    
    ControlCyber controlCyber;
    
    @FXML                                                                   
    private void initialize() {
        iniciarComponentes();
    }
    
    public void setControlCyber(ControlCyber controlCyber) {
        this.controlCyber = controlCyber;
    }
    
    public void iniciarComponentes() {
        Image iconoCobrar = new Image("file:recursos/imagenes/iconos/Untitled-1-04.png");
        this.cobrar.setGraphic(new ImageView(iconoCobrar));
    }
}
