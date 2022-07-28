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
public class program52 {
    static void removeSpecialCharacter(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
         
            if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' && s.charAt(i) < 'a' || s.charAt(i) > 'z')
            {

               
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
            }
        }
        System.out.print(s);
    }
    
    public static void main(String[] args)
    {
        String s = "$P*r;e..pi, ns'ta^?";
        removeSpecialCharacter(s);
    }
    
}
