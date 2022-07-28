/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program41;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @author 91932
 */
public class program55 {
   public static void main(String[] args) throws IOException
   {
      String sourceFile, destFile, line, content="";
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Name of Source File: ");
      sourceFile = scan.nextLine();
      FileReader fr = new FileReader(sourceFile);
       try (BufferedReader br = new BufferedReader(fr)) {
           for(line=br.readLine(); line!=null; line=br.readLine())
               content = content + line + "\n";
       }
      System.out.print("Enter the Name of Destination File: ");
      destFile = scan.nextLine();
       try (FileWriter fw = new FileWriter(destFile)) {
           fw.write(content);
       }
      System.out.println("\nFile copied successfully!");
   }
}
