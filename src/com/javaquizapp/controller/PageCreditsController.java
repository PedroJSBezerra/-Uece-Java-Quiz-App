package com.javaquizapp.controller;

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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class PageCreditsController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Button buttonRank;
    @FXML
    private Button buttonLogout;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void switchToPageRank(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/javaquizapp/ui/PageRank.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void logout(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Seus dados não foram salvos!");
        alert.setContentText("Deseja sair agora?");
        
        if(alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage) anchorPane.getScene().getWindow();
            System.out.println("You successfully logged out!");
            stage.close();
        }
    }
    
}
