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
    //=========================== S O U N D S ============================
    @FXML
    public void strangerThings(ActionEvent event){
        AudioClip stranger = new AudioClip(getClass().getResource("SoundStranger.mp3").toExternalForm());
        stranger.play();
    }
    
    //=========================== N A V I G A T I O N ============================
    @FXML
    public void navigationHandler(ActionEvent event) throws IOException{
        ButtonController controller = new ButtonController();
        controller.navigation(event);
    }
    /*
    @FXML
    private AnchorPane anchorPane;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private void navigationHandler(ActionEvent event) throws IOException{

        String dados = ((Button)event.getSource()).getId();

        switch(dados){ 
            default:
            case "buttonStart":
                showScreen(event,"PageStart.fxml");
                break;
            case "buttonRestart":
            case "buttonRegister":
                showScreen(event,"PageRegister.fxml");
                break;

            case "buttonGameStart":
                showScreen(event,"PageGame.fxml");
                break;
            case "buttonRank":
                showScreen(event,"PageRank.fxml");
                break;
            case "buttonCredits":
                showScreen(event,"PageCredits.fxml");
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
            }
            break;
        }
    }
    
    private void showScreen(ActionEvent event,String dados) throws IOException{
        root = FXMLLoader.load(getClass().getResource(dados));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    */
    //=========================== E N D ============================
    @Override   
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}