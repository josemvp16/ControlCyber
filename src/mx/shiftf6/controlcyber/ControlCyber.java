/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.shiftf6.controlcyber;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Champe
 */
public class ControlCyber extends Application {
        
    private Stage escenarioPrincipal;
    private BorderPane layoutRaiz;
    
    @Override
    public void start(Stage primaryStage) {
        this.escenarioPrincipal = primaryStage;
        this.escenarioPrincipal.setTitle("Control de Cyber | Hecho con amor por Shift-F6");
        
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
            layoutRaiz.setCenter(pantallaUno);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }// Fin try/catch
    }// Fin método

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
