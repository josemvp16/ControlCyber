
package mx.shiftf6.controlcyber.utilerias;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.StageStyle;

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
    
    public Notificacion(String titulo, String cabecera, String mensaje, AlertType tipoAlerta) {
        this.alerta = new Alert(tipoAlerta);
        this.alerta.setTitle(titulo);
        this.alerta.setHeaderText(cabecera);
        this.alerta.setContentText(mensaje);
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
    
    public void mostrar() {
        this.alerta.showAndWait();
    }
    
    public static void dialogoException(Exception ex) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Exception Dialog");
        alert.setHeaderText("Look, an Exception Dialog");
        alert.setContentText("Could not find file blabla.txt!");

        // Create expandable Exception.
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        String exceptionText = sw.toString();

        Label label = new Label("The exception stacktrace was:");

        TextArea textArea = new TextArea(exceptionText);
        textArea.setEditable(false);
        textArea.setWrapText(true);

        textArea.setMaxWidth(Double.MAX_VALUE);
        textArea.setMaxHeight(Double.MAX_VALUE);
        GridPane.setVgrow(textArea, Priority.ALWAYS);
        GridPane.setHgrow(textArea, Priority.ALWAYS);

        GridPane expContent = new GridPane();
        expContent.setMaxWidth(Double.MAX_VALUE);
        expContent.add(label, 0, 0);
        expContent.add(textArea, 0, 1);

        // Set expandable Exception into the dialog pane.
        alert.getDialogPane().setExpandableContent(expContent);

        alert.showAndWait();
    }// Fin método
    
    public static void dialogoAlerta(AlertType alertaTipo, String titulo, String mensaje) {
        Alert alert = new Alert(alertaTipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);

        alert.showAndWait();
    }// Fin método
    
    public static boolean dialogoPreguntar(String titulo, String mensaje){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.initStyle(StageStyle.TRANSPARENT);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);

        Optional<ButtonType> result = alert.showAndWait();
        return result.get() == ButtonType.OK;
    }// Fin método
    
}// Fin clase
