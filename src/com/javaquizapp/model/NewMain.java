
package com.javaquizapp.model;

import java.util.Scanner;

public class NewMain {
    public static String removeLastCharacter(String str) {
            String result = null;
            if ((str != null) && (str.length() > 0)) {
               result = str.substring(0, str.length() - 1);
            }
            return result;
        }
    public static void main(String[] args) {
        removeLastCharacter("ABACATE");
    }
    
}
