package com.javaquizapp.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.media.AudioClip;

class ControllerSounds {
    @FXML
    public void strangerThings(ActionEvent event){
        String audio = getClass().getResource("SoundStranger.mp3").toExternalForm();
        AudioClip stranger = new AudioClip(audio);
        stranger.play();
    }
}
