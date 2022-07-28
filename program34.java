
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
public class program34 {
    static int calc_factorial(int num)
{
int result;
if(num==1){
return 1;
}
        int n = 0;
result= calc_factorial(n-1)* n;
return result;
}
public static void main(String args[])
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number:");
int number = scanner.nextInt();
int factorial = calc_factorial(number);
System.out.println("Factorial is: "+factorial);
}
    
}
