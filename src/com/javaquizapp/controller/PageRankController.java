
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
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class PageRankController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Button buttonRestart;
    @FXML
    private Button buttonCredits;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void switchToPageStart(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/com/javaquizapp/ui/PageStart.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToPageCredits(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/javaquizapp/ui/PageCredits.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
