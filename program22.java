/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91932
 */
public class program22 {
    public static void main(String[] args)
	{
 
		int lastDigit,sum=0,a;    
		int inputNumber=171; 
 
		a=inputNumber; 
        
    
		while(a>0)
		{   System.out.println("Input Number "+a);  
			lastDigit=a%10;   
			System.out.println("Last Digit "+lastDigit); 
			System.out.println("Digit "+lastDigit+ " was added to sum "+(sum*10)); 
			sum=(sum*10)+lastDigit;  
			a=a/10;
			
		}    
 
		
		if(sum==inputNumber)    
			System.out.println("Number is palindrome ");    
		else    
			System.out.println("Number is not palindrome");    
 
	}
    
}
