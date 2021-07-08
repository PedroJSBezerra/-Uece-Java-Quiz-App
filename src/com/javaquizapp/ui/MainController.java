package com.javaquizapp.ui;

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
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

//FXML Controller class
public class MainController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private TextField textName;
    @FXML
    private AnchorPane anchorPane;
    
    //Initializes the controller class.
    @Override   
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    /*======================== S O U N D =========================*/
    @FXML   
    public void strangerThings(ActionEvent event){
        AudioClip stranger = new AudioClip(getClass().getResource("SoundStranger.mp3").toExternalForm());
        stranger.stop();
        stranger.play();
    }
    /*======================== L O G O U T =========================*/
    @FXML
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
    /*======================== N A V I G A T I O N =========================*/
    @FXML 
    public void switchToPageStart(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("PageStart.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToPageRegister(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("PageRegister.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToPageGame(ActionEvent event) throws IOException {
        String playerName = textName.getText();
        System.out.println(playerName);
        
        root = FXMLLoader.load(getClass().getResource("PageGame.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToPageRank(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("PageRank.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToPageCredits(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("PageCredits.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    /*=============================== E N D =========================================*/
}