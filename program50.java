/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program41;

/**
 *
 * @author 91932
 */
public class program50 {
    public static void main(String[] args) {    
        String str = "picture perfect";    
        int[] freq = new int[str.length()];    
        int i, j;    
            
        //Converts given string into character array    
        char string[] = str.toCharArray();    
            
        for(i = 0; i <str.length(); i++) {    
            freq[i] = 1;    
            for(j = i+1; j <str.length(); j++) {    
                if(string[i] == string[j]) {    
                    freq[i]++;    
                        
                    //Set string[j] to 0 to avoid printing visited character    
                    string[j] = '0';    
                }    
            }    
    }
