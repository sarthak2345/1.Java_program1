
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91932
 */
public class program21 {
     public static void main(String[] args) {

      
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");

       
        int num1 = scan.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

     
        scan.close();
        
        
        int product = num1*num2;
        
       
        System.out.println("Output: "+product);
    }
    
}
