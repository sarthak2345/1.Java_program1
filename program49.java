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
public class program49 {
    public static void main(String[] args) {
String a[] = {"hello", "world"};
swap(a);
System.out.println(a[0] + " " + a[1]);
}
static void swap(String[] a) {
String t = a[0];
a[0] = a[1];
a[1] = t;
}
    
}
