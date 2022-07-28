
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91932
 */
public class program41 {
    public static void main (String [] args )
    {
        try {
            
            File f1 = new File ("log.txt ");
             FileWriter fw;
           
                fw = new FileWriter(f1);
            
             fw.write (" size of int:" + ( Integer.SIZE/8) + "bytes."+" Size of long: "+ ( Long.SIZE/8 ) +" bytes."+" Size of char: " + 
                     ( Character.SIZE/8)+ " bytes."+" Size of float : " + ( Float.SIZE/8)+ " bytes."+"Size of double: " + ( Double.SIZE/8)+ " bytes.");
            System.out.println(" size of int:" + ( Integer.SIZE/8) + "bytes.");
        System.out.println(" Size of long: "+ ( Long.SIZE/8 ) +" bytes.");
        System.out.println(" Size of char: " + ( Character.SIZE/8)+ " bytes.");
        System.out.println( " Size of float : " + ( Float.SIZE/8)+ " bytes.");
        System.out.println("Size of double: " + ( Double.SIZE/8)+ " bytes.");
            
           fw.close();
            
        } catch (IOException ex) {
                Logger.getLogger(program4.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
}
