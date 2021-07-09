/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PedroJSBezerra
 */
public class PageRegisterController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Button buttonStart;
    @FXML
    private Button buttonGameStart;
    @FXML
    private TextField textName;
    @FXML
    private RadioButton news;
    @FXML
    private ToggleGroup categoryGroup;
    @FXML
    private RadioButton rbStrangerThings;

    /**
     * Initializes the controller class.
     */
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
    public void switchToPageGame(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/javaquizapp/ui/PageGame.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML   
    public void strangerThings(ActionEvent event){
        AudioClip stranger = new AudioClip(getClass().getResource("/com/javaquizapp/ui/sounds/SoundStranger.mp3").toExternalForm());
        stranger.stop();
        stranger.play();
    }
    
}
