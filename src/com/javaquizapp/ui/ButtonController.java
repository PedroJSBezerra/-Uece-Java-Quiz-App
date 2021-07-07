
package com.javaquizapp.ui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ButtonController {
    
    @FXML
    private AnchorPane anchorPane;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    private void showScreen(ActionEvent event,String dados) throws IOException{
        root = FXMLLoader.load(getClass().getResource(dados));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    void navigation(ActionEvent event) throws IOException {
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
}
