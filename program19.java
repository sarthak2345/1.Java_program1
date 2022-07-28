
import static java.awt.PageAttributes.MediaType.C2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91932
 */
public class program19 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
    int real, imaginary;
  
    // Empty Constructo    program19()
    {
    }
  
    // Constructor to accept
    // real and imaginary part
    program19(int tempReal,)
 int = 0 tempImaginary
    {
            int tempReal = 0;
        real = tempReal;
            int tempImaginary = 0;
        imaginary = tempImaginary;
    }
  
    // Defining addComp() method
    // for adding two complex number
    Complex addComp(Complex C1, Complex C2)
    {
        // creating temporary variable
        Complex temp = new Complex();
  
        // adding real part of complex numbers
        temp.real = C1.real + C2.real;
  
        // adding Imaginary part of complex numbers
        temp.imaginary = C1.imaginary + C2.imaginary;
  
        // returning the sum
        return temp;
    }
  
    // Defining subtractComp() method
    // for subtracting two complex number
    Complex subtractComp(Complex C1, Complex C2)
    {
        // creating temporary variable
        Complex temp = new Complex();
  
        // subtracting real part of complex numbers
        temp.real = C1.real - C2.real;
  
        // subtracting Imaginary part of complex numbers
        temp.imaginary = C1.imaginary - C2.imaginary;
  
        // returning the difference
        return temp;
    }
  
    // Function for printing complex number
    void printComplexNumber()
    {
        System.out.println("Complex number: "
                           + real + " + "
                           + imaginary + "i");
    }
    
}

    private static program19() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static program19() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static program19() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
