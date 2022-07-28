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
public class program411 {
    public static void main(String[] args) {

    double array[] = {10, 20, 30, 40, 50};
    
    double sum = 0.0;
   
    double avg = 0.0;

    
    for (int i=0; i<array.length; i++) {
     
      sum = sum + array[i];
    }

    
    avg = sum/array.length;

    
    System.out.println("Average: " + avg );
  }
}
