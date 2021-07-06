/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquizapp.View;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

//FXML Controller class
public class MainController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Button buttonLogout;
    @FXML
    private Button buttonNext;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
     
    @Override   //Initializes the controller class.
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML   //button sound
    public void strangerThings(ActionEvent event){
        AudioClip stranger = new AudioClip(getClass().getResource("stranger.mp3").toExternalForm());
        stranger.play();
    }
    @FXML   //action for logout button
    public void logout(ActionEvent event){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Seus dados não foram salvos!");
        alert.setContentText("Deseja sair agora?");
        if(alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage) anchorPane.getScene().getWindow();
            System.out.println("You successfully logged out!");
            stage.close();
        }
    }
    @FXML //switch Scenes
    private void switchToStartPage(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("StartPage.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void switchToRegisterPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("RegisterPage.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}