package com.javaquizapp.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

//FXML Controller class
public class ControllerMain implements Initializable {
    //=========================== E V E N T  H A N D L E R ============================
    public void eventHandler(ActionEvent event) throws IOException{
    ControllerNavigation nav = new ControllerNavigation();
    ControllerSounds sound = new ControllerSounds();
    
        nav.navigation(event);
        sound.strangerThings(event);
    }
    
    //=========================== E N D ============================
    @Override   
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}