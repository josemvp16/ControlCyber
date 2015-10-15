
package mx.shiftf6.controlcyber;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import mx.shiftf6.controlcyber.vista.Pantalla1Control;
import mx.shiftf6.controlcyber.vista.Pantalla2Control;

/**
 *
 * @author Champe
 */
public class ControlCyber extends Application {
        
    private Stage escenarioPrincipal;
    private BorderPane layoutRaiz;
    
    @Override
    public void start(Stage primaryStage) {
        escenarioPrincipal = primaryStage;
        escenarioPrincipal.setTitle("Control de Cyber | Hecho con amor por Shift-F6");
        
        // Configuramos icono de aplicacion
        this.escenarioPrincipal.getIcons().add(new Image("file:recursos/imagenes/iconos/IconPNG.png"));
        
        iniciarLayoutRaiz();
        
        mostrarPantallaUno();
    }
    
    /**
     * Inicializamos el layout raiz
     */
    public void iniciarLayoutRaiz() {
        try{
            // Cargamos el layout raiz del archivo fxml
            FXMLLoader cargador = new FXMLLoader();
            cargador.setLocation(ControlCyber.class.getResource("vista/LayoutRaiz.fxml"));
            layoutRaiz = (BorderPane) cargador.load();
            
            // Mostramos la escena que contiene el layout raiz
            Scene scene = new Scene(layoutRaiz);
            escenarioPrincipal.setScene(scene);
            //escenarioPrincipal.setMaximized(true);
            escenarioPrincipal.setFullScreen(true);
            escenarioPrincipal.setFullScreenExitHint("Preciona Ctrl+X pasa salir de Fullscreen");
            escenarioPrincipal.setFullScreenExitKeyCombination(new KeyCodeCombination(KeyCode.X, KeyCombination.CONTROL_DOWN));
            escenarioPrincipal.setAlwaysOnTop(true);
            escenarioPrincipal.show();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }// Fin try/catch
    }// Fin método
    
    /**
     * Mostramos la pantalla uno dentro del layout raíz
     */
    public void mostrarPantallaUno() {
        try{
            FXMLLoader cargador = new FXMLLoader();
            cargador.setLocation(ControlCyber.class.getResource("vista/Pantalla1.fxml"));
            AnchorPane pantallaUno = (AnchorPane) cargador.load();
            
            // Colocamos la pantalla uno al centro del layout raíz
            layoutRaiz.setCenter(null);
            layoutRaiz.setCenter(pantallaUno);
            
            // Damos acceso al controlador a la aplicacion control cyber
            Pantalla1Control controlador = cargador.getController();
            controlador.setControlCyber(this);
            
        } catch (IOException ioe){
            ioe.printStackTrace();
        }// Fin try/catch
    }// Fin método
    
    /**
     * Mostramos la pantalla dos dentro del layout 
     */
    public void mostrarPantallaDos() {
        try{
            FXMLLoader cargador = new FXMLLoader();
            cargador.setLocation(ControlCyber.class.getResource("vista/Pantalla2.fxml"));
            AnchorPane pantallaDos = (AnchorPane) cargador.load();
            
            // Colocamos la pantalla dos al centro del layout raíz
            layoutRaiz.setCenter(null);
            layoutRaiz.setCenter(pantallaDos);
            
            // Damos acceso acceso al controlador de pantalla dos a la aplicación ControCyber
            Pantalla2Control controlador = cargador.getController();
            controlador.setControlCyber(this);
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }// Fin try/catch
    }// Fin método

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }// Fin método
    
}// Fin clase
