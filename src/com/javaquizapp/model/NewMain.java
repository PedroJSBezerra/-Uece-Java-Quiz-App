
package com.javaquizapp.model;

public class NewMain {
    
    static String playerName = "";
    static int playerScore = 0;
    static String playerLife = "OOOOOOO";
    
    public String queryList[][] = {
        {""}
    };
    
    static String showQuery(){
        NewMain newMain = new NewMain();
        
        
        String query = newMain.queryList[0][0];
        return query;
    }
    
    static void showScreen(){
        System.out.println(
            "Player Name: "+playerName+" Player Score: "+playerScore+"Player Life: "+playerLife+"\n"+"\n"+
            
            "Pergunta: "+"\n"+
            ""
        );
    }
    
    public static void main(String[] args) {
        showScreen();
    }
    
}
