package com.javaquizapp.controller;

import com.javaquizapp.model.Player;
import java.io.IOException;
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
import javafx.scene.media.AudioClip;
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
    }
    /*================================= L O G I C ========================================*/
    
    @FXML
    public void setPlayerstatus(String name, Integer score, String life){
        lblName.setText(name);
        lblScore.setText(score.toString());
        lblLife.setText(life);
        setQuery();
    }
    @FXML
    public void setQuery() {
        String list[][] = {
            {"Qual é o nome do CEO da Space-X?","Elon Reeve Musk","Elon Reeve Java", "Elon Reeve Maik", "Elon Reeve Jobs"},
            {"Qual valor da soma 1 + 1?", "2","3","6","-1"},
            {"Qual é o sistema mais ultilizado em dispositivos móveis?","Android","Apple","Symbian","iOS"},
            {"HTML é uma linguagem de?","Marcaçâo","Programação","Ostentação","Estilização"},
            {"A abreviação correta para Cascade Style Sheets é?", "CSS","CAS","CSY","SSC"},
            /*
            {"Qual é o retorno da expressão: (22>202)?'Banana':'Maçã'  ?", "Maçã","Banana","22","202"},
            {"Complete a sequência logica para fazer um bolo: Ovos, Leite, Farinha, Misturar e?", "Assar","Comer","Cheirar","Cortar"},
            {"O simbolo da linguagem Java é:", "Uma Xicara","Um passaro","Um avião","Um livro"},
            {"A sigla para Scalable Vector Graphics é?", "SVG","VGS","VHS","GVS"},
            {"Se com 1 litro de gasolina meu carro anda 13km com 2 litros andará:", "26000metros","22000metros","20000metros","13000metros"},
            */
        };
        //random query selection
        Random rand = new Random();
        int i = rand.nextInt(list.length);
        //set random query index in array
        String query = list[i][0];
        //get asnwer index from array
        answer = list[i][1];
        
        //get list of hints in range selected
        String hintList[] = Arrays.copyOfRange(list[i], 1,list.length); //get specif item range
        //convert to list
        List<String> strList = Arrays.asList(hintList);
        //shufle hint list
        Collections.shuffle(strList);
        //convert to arr to use 
        strList.toArray(hintList);
        textQuery.setText(query);
        option1.setText(hintList[0]);
        option2.setText(hintList[1]);
        option3.setText(hintList[2]);
        option4.setText(hintList[3]);
    }
    String answer;
    
    @FXML
    private void checkAnswer(ActionEvent event) throws IOException {
        
        //return the object thet generated the event.
        Object node = event.getSource(); 
        //since the returned object is a Button you can cast it to one.
        Button btnOption = (Button)node;
        //print clicked text of the Button
        String option = btnOption.getText();
        if(option == answer){
            Integer playerScore = Integer.parseInt(lblScore.getText());
            playerScore++;
            AudioClip Correct = new AudioClip(getClass().getResource("/com/javaquizapp/ui/sounds/Correct.wav").toExternalForm());
            Correct.stop();
            Correct.play();
            lblScore.setText(playerScore.toString());
            setQuery();
        }else{
            String string = lblLife.getText();  
            //creating a constructor of StringBuffer class  
            StringBuffer sb = new StringBuffer(string);  
            //invoking the method  
            sb.deleteCharAt(sb.length()-1);
            lblLife.setText(sb.toString());
            
            AudioClip Error = new AudioClip(getClass().getResource("/com/javaquizapp/ui/sounds/Error.wav").toExternalForm());
            Error.stop();
            Error.play();
            
            if(lblLife.getText().length() == 0){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/javaquizapp/ui/PageRank.fxml"));
                Parent root = loader.load();
                //get the controller
                PageRankController rank = loader.getController();
                //set data in the controller
                String name = lblName.getText();
                Integer score = Integer.parseInt(lblScore.getText());
                rank.setPlayerRank(name,score);

                stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
        
    }
}
