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
        AudioClip stranger = new AudioClip(getClass().getResource("SoundStranger.mp3").toExternalForm());
        stranger.play();
    }
    
    private void showScreen(ActionEvent event){
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void navigationHandler(ActionEvent event) throws IOException{
        try{
            boolean flagLogout = false;
        
            String dados = ((Button)event.getSource()).getId();

            switch(dados){ 
                default:
                case "buttonStart":
                    root = FXMLLoader.load(getClass().getResource("PageStart.fxml"));
                    break;
                case "buttonRestart":
                case "buttonRegister":
                    root = FXMLLoader.load(getClass().getResource("PageRegister.fxml"));
                    break;

                case "buttonGameStart":
                    root = FXMLLoader.load(getClass().getResource("PageGame.fxml"));
                    break;
                case "buttonRank":
                    root = FXMLLoader.load(getClass().getResource("PageRank.fxml"));
                    break;
                case "buttonCredits":
                    root = FXMLLoader.load(getClass().getResource("PageCredits.fxml"));
                    break;
                case "buttonLogout":
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Logout");
                alert.setHeaderText("Seus dados não foram salvos!");
                alert.setContentText("Deseja sair agora?");
                
                if(alert.showAndWait().get() == ButtonType.OK){
                    stage = (Stage) anchorPane.getScene().getWindow();
                    System.out.println("You successfully logged out!");
                    stage.close();
                    flagLogout = true;
                }
                break;
            }
            //get and test Id of button
            if(!flagLogout){
                showScreen(event);
            }
        }catch(NullPointerException e){
            System.out.println("Falha!");
        }
    }
}