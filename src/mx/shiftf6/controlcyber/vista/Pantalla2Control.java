
package mx.shiftf6.controlcyber.vista;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import mx.shiftf6.controlcyber.ControlCyber;
import mx.shiftf6.controlcyber.modelo.UsuarioDAO;
import mx.shiftf6.controlcyber.modelo.UsuarioModelo;
import mx.shiftf6.controlcyber.utilerias.Notificacion;

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
    private UsuarioDAO usuarioDAO;
    
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
    
    /**
     * Valida las credenciales de usuario para permitir acceso
     */
    public void inisiarSesion() {
        usuarioModelo = new UsuarioModelo(this.textoUsuario.getText(), this.passwordContrasena.getText());
        usuarioDAO = new UsuarioDAO();
        Notificacion notificacion = new Notificacion("Inicio de Sesión", null, null, null);
        int existeUsuario = usuarioDAO.buscarUsuario(usuarioModelo);
        if (existeUsuario == UsuarioDAO.ERROR_SQL) {
            notificacion.setMensaje("Error en la sentencia SQL");
            notificacion.setTipo(AlertType.ERROR);
            notificacion.mostrar();
            regresarPantallaBloqueo();
        } else if (existeUsuario == UsuarioDAO.USUARIO_INCORRECTO) {
            notificacion.setMensaje("El nombre de usuario es incorrecto");
            notificacion.setTipo(AlertType.WARNING);
            notificacion.mostrar();
            regresarPantallaBloqueo();
        } else if (existeUsuario == UsuarioDAO.CONTRASENA_INCORRECTA) {
            notificacion.setMensaje("La contraseña de usuario es incorrecta");
            notificacion.setTipo(AlertType.WARNING);
            notificacion.mostrar();
            regresarPantallaBloqueo();
        } else if (existeUsuario == UsuarioDAO.USUARIO_BLOQUEADO) {
            notificacion.setMensaje("El usuario esta bloqueado consulta al administrador");
            notificacion.setTipo(AlertType.WARNING);
            notificacion.mostrar();
            regresarPantallaBloqueo();
        } else if (existeUsuario == UsuarioDAO.CREDENCIALES_VALIDAS) {
//            notificacion.setMensaje("Los datos de usuario son correctos");
//            notificacion.setTipo(AlertType.CONFIRMATION);
//            notificacion.mostrar();
            mostrarVentanaVenta();
        }// Fin if/else
        if(usuarioDAO.cerrarConexion() == UsuarioDAO.ERROR_SQL) {
            notificacion.setMensaje("Error al cerrar la conexión");
            notificacion.setTipo(AlertType.ERROR);
            notificacion.mostrar();
        }// Fin if
    }// Fin método
    
    /**
     * Regresa a la pantalla de bloque
     */
    public void regresarPantallaBloqueo() {
        this.controlCyber.mostrarPantallaUno();
    }// Fin método
    
    /**
     * Muestra la ventana de venta
     */
    public void mostrarVentanaVenta() {
        this.controlCyber.mostrarVentanaVenta();
    }
    
    /**
     * 
     * @param event 
     */
    @Override
    public void handle(KeyEvent event) {
        String tecla = event.getCode().toString();
        System.out.println(tecla);
        switch (tecla) {
            case "ESCAPE":
                regresarPantallaBloqueo();
                break;
            case "WINDOWS":
                event.consume();
                break;
            case "ENTER":
                inisiarSesion();
                break;
        }
    }
    
}
