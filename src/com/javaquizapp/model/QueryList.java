
package com.javaquizapp.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class QueryList {
    public String list[][] = {
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
    public String query = list[i][0];             //the query
    //get asnwer index from array
    public String answer = list[i][1];            //the answer
    //get list of hints in range selected
    String hintList[] = Arrays.copyOfRange(list[i], 1,list.length); //get specif item range
    //convert to list
    List<String> strList = Arrays.asList(hintList);
    public String[] hint(){
        //shufle hint list
        Collections.shuffle(strList);
        //convert to arr to use 
        return strList.toArray(hintList);
    }

}
