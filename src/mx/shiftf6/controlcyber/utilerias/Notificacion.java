
package mx.shiftf6.controlcyber.utilerias;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 *
 * @author Champe
 */
public class Notificacion {
    
    private Alert alerta;
    private String titulo;
    private String cabecera;
    private String mensaje;
    private AlertType tipo;

    public Notificacion(AlertType tipoAlerta) {
        this.alerta = new Alert(tipoAlerta);
    }// Fin constructor

    public Alert getAlerta() {
        return alerta;
    }// Fin método

    public void setAlerta(Alert alerta) {
        this.alerta = alerta;
    }// Fin método

    public String getTitulo() {
        return titulo;
    }// Fin método

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        this.alerta.setTitle(titulo);
    }// Fin método

    public String getCabecera() {
        return cabecera;
    }// Fin método

    public void setCabecera(String cabecera) {
        this.cabecera = cabecera;
        this.alerta.setHeaderText(cabecera);
    }// Fin método

    public String getMensaje() {
        return mensaje;
    }// Fin método

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
        this.alerta.setContentText(mensaje);
    }// Fin método

    public AlertType getTipo() {
        return tipo;
    }// Fin método

    public void setTipo(AlertType tipo) {
        this.tipo = tipo;
        this.alerta.setAlertType(tipo);
    }// Fin método
    
}
