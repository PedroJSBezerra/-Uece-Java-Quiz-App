package com.javaquizapp.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.AudioClip;

//FXML Controller class
public class ControllerMain implements Initializable {
    //=========================== S O U N D S ============================
    @FXML
    public void strangerThings(ActionEvent event){
        String audio = getClass().getResource("SoundStranger.mp3").toExternalForm();
        AudioClip stranger = new AudioClip(audio);
        stranger.play();
    }
    
    //=========================== E V E N T  H A N D L E R ============================
    public void eventHandler(ActionEvent event) throws IOException{
    ControllerNavigation nav = new ControllerNavigation();
        nav.navigation(event);
    }
    
    //=========================== E N D ============================
    @Override   
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}