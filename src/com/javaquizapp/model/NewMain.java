
package com.javaquizapp.model;

import java.util.Scanner;

public class NewMain {
    
    static String playerName = "";
    static int playerScore = 0;
    static String playerLife = "OOOOOOO";
    
    public String queryList[][] = {
        {"Qual é o nome do CEO da Space-X?","Elon Reeve Musk","Elon Reeve Java", "Elon Reeve Maik", "Elon Reeve Jobs"},
        {"Qual valor da soma 1 + 1?", "2","3","6","-1"},
        {"Qual é o sistema mais ultilizado em dispositivos móveis?","Android","Apple","Symbian","iOS"},
        {"HTML é uma linguagem de?","Marcaçâo","Programação","Ostentação","Estilização"},
        {"A abreviação correta para Cascade Style Sheets é?", "CSS","CAS","CSY","SSC"},
    };
    public String answerList[][] = {
        {"A"},{"A"},{"A"},{"A"},{"A"},
    };
    
    static void showScreen(){
        System.out.println("Qual seu nome?: ");
        
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        playerName = name;
        
        NewMain newMain = new NewMain();
        int i = -1; 
        i++;
        
        System.out.println(
            "================================================="+"\n"+
            "Player Name: "+playerName+"  Player Score: "+playerScore+"  Player Life: "+playerLife+"\n"+"\n"+
            
            "Pergunta: "+"\n"+
            newMain.queryList[i][0]+"\n"+
            "(A)"+newMain.queryList[i][1]+"\n"+
            "(B)"+newMain.queryList[i][2]+"\n"+
            "(C)"+newMain.queryList[i][3]+"\n"+
            "(D)"+newMain.queryList[i][4]+"\n"
        );
        String response = scan.next();
        if(response == "A"){
            playerScore++;
            showScreen();
        };
        
    }
    
    public static void main(String[] args) {
        showScreen();
    }
    
}
