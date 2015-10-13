/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.shiftf6.controlcyber;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
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
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!"); 
            }
        });
        
        try{
            FXMLLoader cargador = new FXMLLoader();
            cargador.setLocation(ControlCyber.class.getResource("vista/LayoutRaiz.fxml"));
            layoutRaiz = (BorderPane) cargador.load();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }        
        
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 1440, 900);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
