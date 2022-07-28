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
public class program544 {
    public static void main(String arg[])	
	{
           
	    
            Scanner sc=new Scanner(System.in);
		
	    System.out.println("Enter the string1");
	    String str1= sc.nextLine();  
	    
	    System.out.println("Enter the string2");
	    String str2= sc.nextLine();
 
	    
	     
	    
	    System.out.println(" concatenaate------->"+"("+concat(str1,str2)+")");
	}            
	static String concat( String s1,String s2)
	{   
	   String s=s2+','+s1;
	    return s;
	}
    
}
