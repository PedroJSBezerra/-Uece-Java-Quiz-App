package com.javaquizapp.ui;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Main extends Application {
    //First load StartPage aplication
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PageStart.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Java Quiz App");
        stage.setScene(scene);
        stage.show();
        
        //implements logout confirmation on stage
        stage.setOnCloseRequest(event -> {
            event.consume();
            logout(stage);
        });
    }
    
    //logout confirmation on stage
    public void logout(Stage stage){
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Seus dados não foram salvos!");
        alert.setContentText("Deseja sair agora?");
        
        if(alert.showAndWait().get() == ButtonType.OK){
            System.out.println("You successfully logged out!");
            stage.close();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
