/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_6;

/**
 *
 * @author HP
 */
public class Outer_Class {
    void display()  
    {
        System.out.println("Outer class");
        Inner i=new Inner();
        i.display();
        
    }
    class Inner
    {
        void display()
        {
            System.out.println("Inner class");
        }
        
        }
    public static void main(String a[])
    {
        Outer_Class O=new Outer_Class();
        O.display();
        
    }
    
}
