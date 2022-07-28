
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
public class program33 {
    public static int sumOfNaturalNumbers(int N){
        if(N == 1){
            return 1;
        }
        return N + sumOfNaturalNumbers(N-1);
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N :");
        int N = sc.nextInt();
        
        int sum = sumOfNaturalNumbers(N);
        System.out.println("Sum of N Natural Numbers are "+sum);
        
    }
    
}
