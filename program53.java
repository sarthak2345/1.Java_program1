/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program41;

import java.util.Scanner;

/**
 *
 * @author 91932
 */
public class program53 {
    public static void main(String[] args)
   {
      String str;
      int len=0;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the String: ");
      str = scan.nextLine();
      
      char[] strChars = str.toCharArray();
      for(char ch: strChars)
         len++;
      
      System.out.println("\nLength of String = " +len);
   }
    
}
