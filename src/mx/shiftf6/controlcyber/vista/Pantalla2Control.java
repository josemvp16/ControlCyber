
package mx.shiftf6.controlcyber.vista;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import mx.shiftf6.controlcyber.ControlCyber;
import mx.shiftf6.controlcyber.modelo.UsuarioModelo;

/**
 *
 * @author Champe
 */
public class Pantalla2Control implements EventHandler<KeyEvent> {
    
    @FXML
    private TextField textoUsuario;
    @FXML
    private PasswordField passwordContrasena;
    @FXML
    private Pane panelCampos;
    
    private ControlCyber controlCyber;
    private UsuarioModelo usuarioModelo;
    
    @FXML
    private void initialize() {
        iniciarComponentes();
    }// Fin método
    
    public void setControlCyber(ControlCyber controlCyber){
        this.controlCyber = controlCyber;
    }// Fin método
    
    public void iniciarComponentes() {
        this.textoUsuario.setOnKeyPressed(this);
        this.passwordContrasena.setOnKeyPressed(this);
    }
    
    public void setUsuario() {
        this.usuarioModelo = new UsuarioModelo();
        this.usuarioModelo.setNombreUsuario(this.textoUsuario.getText());
        this.usuarioModelo.setContrasena(this.passwordContrasena.getText());
    }// Fin método
    
    public void inisiarSesion() {
        
    }
    
    public void regresarPantallaBloqueo() {
        this.controlCyber.mostrarPantallaUno();
    }

    @Override
    public void handle(KeyEvent event) {
        String tecla = event.getCode().toString();
        switch (tecla) {
            case "ESCAPE":
                regresarPantallaBloqueo();
                break;
            case "WINDOWS":
                event.consume();
                break;
        }
    }
    
}
