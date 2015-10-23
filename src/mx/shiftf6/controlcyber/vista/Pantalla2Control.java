
package mx.shiftf6.controlcyber.vista;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import mx.shiftf6.controlcyber.ControlCyber;
import mx.shiftf6.controlcyber.modelo.BitacoraDAO;
import mx.shiftf6.controlcyber.modelo.BitacoraModelo;
import mx.shiftf6.controlcyber.modelo.DetalleBitacoraDAO;
import mx.shiftf6.controlcyber.modelo.DetalleBitacoraModelo;
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
    private BitacoraModelo bitacoraModelo;
    private BitacoraDAO bitacoraDAO;
    private DetalleBitacoraModelo detalleBitacoraModelo;
    private DetalleBitacoraDAO detalleBitacoraDAO;
    
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
    public void iniciarSesion() {
        usuarioModelo = new UsuarioModelo(this.textoUsuario.getText(), this.passwordContrasena.getText());
        usuarioDAO = new UsuarioDAO();
        int existeUsuario = usuarioDAO.buscarUsuario(usuarioModelo);
        if (existeUsuario == UsuarioDAO.ERROR_SQL) {
            Notificacion.dialogoAlerta(AlertType.ERROR, "Base de Datos [BuscarUsuario]", "Error en la sentencia SQL");
            regresarPantallaBloqueo();
        } else if (existeUsuario == UsuarioDAO.USUARIO_INCORRECTO) {
            Notificacion.dialogoAlerta(AlertType.ERROR, "Inicio de Sesión [BuscarUsuario]", "El usuario no existe");
            regresarPantallaBloqueo();
        } else if (existeUsuario == UsuarioDAO.CONTRASENA_INCORRECTA) {
            Notificacion.dialogoAlerta(AlertType.ERROR, "Inisio de Sesión [BuscarUsuario]", "La contraseña es incorrecta");
            regresarPantallaBloqueo();
        } else if (existeUsuario == UsuarioDAO.USUARIO_BLOQUEADO) {
            Notificacion.dialogoAlerta(AlertType.ERROR, "Inicio de Sesión [BuscarUsuario]", "El usuario esta bloqueado consulta al admnistrador");
            regresarPantallaBloqueo();
        } else if (existeUsuario == UsuarioDAO.CREDENCIALES_VALIDAS) {
//            notificacion.setMensaje("Los datos de usuario son correctos");
//            notificacion.setTipo(AlertType.CONFIRMATION);
//            notificacion.mostrar();
            mostrarVentanaVenta();
        }// Fin if/else
        if(usuarioDAO.cerrarConexion() == UsuarioDAO.ERROR_SQL) {
            Notificacion.dialogoAlerta(Alert.AlertType.ERROR, "Base de Datos [BuscarUsuario]", "Error en la sentencia SQL");
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
        // TODO agregar metodos para crear registro en bitacora
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
                iniciarSesion();
                break;
        }
    }
    
}
