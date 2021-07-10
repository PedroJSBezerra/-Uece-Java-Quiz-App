package com.javaquizapp.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Set;
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
    @FXML
    private Button btnChectAnswer;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    public void setPlayerstatus(String name, Integer score, String life){
        lblName.setText(name);
        lblScore.setText(score.toString());
        lblLife.setText(life);
        
        setAnswer();
    }
    public void setAnswer() {
        Map <String, String> queryMap = new HashMap <> ();
        queryMap.put("Qual é o nome do CEO da Space-X?","Elon Reeve Musk");
        queryMap.put("Qual valor da soma 1 + 1?", "2");
        queryMap.put("Qual é o sistema mais ultilizado em dispositivos móveis?","Android");
        queryMap.put("HTML é uma linguagem de?","Marcaçâo");
        queryMap.put("A abreviação correta para Cascade Style Sheets é?", "CSS");
        Set <Map.Entry <String, String>> setList = queryMap.entrySet();
        List <Map.Entry <String, String>> queryList = new ArrayList <> (setList);
        
        /*String queryList[][] = {
            {},
            {},
            {},
            {},
        };*/
        
        String hintList[][] = {
            {"Elon Reeve Java", "Elon Reeve Maik", "Elon Reeve Jobs"},
            {"3","6","-1"},
            {"Apple","Symbian","iOS"},
            {"Programação","Ostentação","Estilização"},
            {"CAS","CSY","SSC"},
        };
        
        Random random = new Random();
        int randomQuery = random.nextInt((queryList.size()-1)+1)+0;

        
        String query = queryList.get(randomQuery).getKey();
        String answer = queryList.get(randomQuery).getValue();
       
        
        textQuery.setText(query);
        
        option1.setText(answer);
        option2.setText(hintList[randomQuery][0]);
        option3.setText(hintList[randomQuery][1]);
        option4.setText(hintList[randomQuery][2]);
    }

    @FXML
    private void checkAnswer(ActionEvent event) {
        setAnswer();
    }
}