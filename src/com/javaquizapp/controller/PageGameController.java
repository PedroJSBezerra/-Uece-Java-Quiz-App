package com.javaquizapp.controller;

import com.javaquizapp.model.QueryList;
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    public void setPlayerstatus(String name, Integer score, String life){
        lblName.setText(name);
        lblScore.setText(score.toString());
        lblLife.setText(life);
        
        setAnswer();
    }
    @FXML
    public void setAnswer() {
        /*
        String list[][] = {
            {"Qual é o nome do CEO da Space-X?","Elon Reeve Musk","Elon Reeve Java", "Elon Reeve Maik", "Elon Reeve Jobs"},
            {"Qual valor da soma 1 + 1?", "2","3","6","-1"},
            {"Qual é o sistema mais ultilizado em dispositivos móveis?","Android","Apple","Symbian","iOS"},
            {"HTML é uma linguagem de?","Marcaçâo","Programação","Ostentação","Estilização"},
            {"A abreviação correta para Cascade Style Sheets é?", "CSS","CAS","CSY","SSC"},
        };
        //random query selection
        Random rand = new Random();
        int i = rand.nextInt(list.length);
        //set random query index in array
        String query = list[i][0];
        //get asnwer index from array
        String answer = list[i][1];
        
        //get list of hints in range selected
        String hintList[] = Arrays.copyOfRange(list[i], 1,list.length); //get specif item range
        //convert to list
        List<String> strList = Arrays.asList(hintList);
        //shufle hint list
        Collections.shuffle(strList);
        //convert to arr to use 
        strList.toArray(hintList);
        */
        QueryList list = new QueryList();
        
        textQuery.setText(list.query);
        option1.setText(list.hint()[0]);
        option2.setText(list.hint()[1]);
        option3.setText(list.hint()[2]);
        option4.setText(list.hint()[3]);
    }
    @FXML
    private void checkAnswer(ActionEvent event) {
        /*
        QueryList list = new QueryList();
        //return the object thet generated the event.
        Object node = event.getSource(); 
        //since the returned object is a Button you can cast it to one.
        Button option = (Button)node;
        //print clicked text of the Button
        System.out.println(option.getText());
        System.out.println(list.answer);
        */
        setAnswer();
    }
}