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
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

//FXML Controller class
public class ControllerMain implements Initializable {

    //==================== S O U N D S ============================
    @FXML
    public void strangerThings(ActionEvent event){
        String audio = getClass().getResource("SoundStranger.mp3").toExternalForm();
        AudioClip stranger = new AudioClip(audio);
        stranger.stop();
        stranger.play();
    }
    
    //=============== E V E N T  H A N D L E R =================
    @FXML
    TextField textName;
    
    @FXML
    public void eventHandler(ActionEvent event) throws IOException{
        
        String btnId = ((Button)event.getSource()).getId();
            
        switch(btnId){
            case "buttonStart":
                showScreen(event,"PageStart.fxml");
                break;
            case "buttonRestart":
            case "buttonRegister":
                showScreen(event,"PageRegister.fxml");
                break;
            case "buttonGameStart":
                String playerName = textName.getText();
                playerData(playerName);
                showScreen(event,"PageGame.fxml");
                break;

            case "buttonRank":
                showScreen(event,"PageRank.fxml");
                break;
            case "buttonCredits":
                showScreen(event,"PageCredits.fxml");
                break;
            case "buttonLogout":
                exitScreen(event);
                break;
            default:
                showScreen(event,"PageStart.fxml");
        }
    }
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void showScreen(ActionEvent event,String dados) throws IOException{
        root = FXMLLoader.load(getClass().getResource(dados));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void exitScreen(ActionEvent event) throws IOException{
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Seus dados não foram salvos!");
        alert.setContentText("Deseja sair agora?");

        if(alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            System.out.println("You successfully logged out!");
            stage.close();
        }
    }
    private void playerData(String playerName) {
        System.out.println("Player name: "+"\n"+playerName);
    }
    
    //==================== E N D ============================
    @Override   
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


}