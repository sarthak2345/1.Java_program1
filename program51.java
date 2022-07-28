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
public class program51 {
    public static void main(String[] args) {
    String line = "This website is aw3som3.";
    int vowels = 0, consonants = 0, digits = 0, spaces = 0;

    line = line.toLowerCase();
    for (int i = 0; i < line.length(); ++i) {
      char ch = line.charAt(i);


      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        ++vowels;
      }

   
      else if ((ch >= 'a' && ch <= 'z')) {
        ++consonants;
      }
      
    
      else if (ch >= '0' && ch <= '9') {
        ++digits;
      }
      
   
      else if (ch == ' ') {
        ++spaces;
      }
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
    System.out.println("Digits: " + digits);
    System.out.println("White spaces: " + spaces);
  }
}
