
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
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
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
    @FXML
    private Text lblMessage;
    @FXML
    private Label lblRankScore;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
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
    void setPlayerRank(String name, Integer score) {
        
        if(score <= 5){
            lblMessage.setText("Você precisa se esforçar mais.");
        }else if(score <= 10){
            lblMessage.setText("Parece que está melhorando!");
        }else if(score <= 15){
            lblMessage.setText("Nem precisa mais pesquisar no Google!");
        }else if(score > 20){
            lblMessage.setText("Master!");
        }
        
        lblRankScore.setText(score.toString());
    }
    
}
