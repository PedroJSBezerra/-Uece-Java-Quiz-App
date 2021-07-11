package com.javaquizapp.controller;

import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PageGameController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Label lblName;
    @FXML
    private Label lblScore;
    @FXML
    private Label lblLife;
    @FXML
    private Text textQuery;
    @FXML
    private Button option1;
    @FXML
    private Button option2;
    @FXML
    private Button option3;
    @FXML
    private Button option4;
    private String aswer;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("INITIALIZED");
        setQuery();
    }
    @FXML
    public void setPlayerstatus(String name, Integer score, String life){
        lblName.setText(name);
        lblScore.setText(score.toString());
        lblLife.setText(life);
    }
    Query query = new Query();
    @FXML
    public void setQuery() {
                
        textQuery.setText(query.list());
        option1.setText(query.getHint()[0]);
        option2.setText(query.getHint()[1]);
        option3.setText(query.getHint()[2]);
        option4.setText(query.getHint()[3]);
    }
    @FXML
    private void checkAnswer(ActionEvent event) {
        //return the object thet generated the event.
        Object node = event.getSource(); 
        //since the returned object is a Button you can cast it to one.
        Button option = (Button)node;
        //print clicked text of the Button
        setQuery();
    }
}