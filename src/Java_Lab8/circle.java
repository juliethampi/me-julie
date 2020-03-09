/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Lab8;

import mypack.CIRCLE;

/**
 *
 * @author MCALAB01029
 */
public class circle extends CIRCLE {
    double Area;
    void Area()
    {
      read();
      Area=3.141*r*r;
      
    }
    void display()
    {
        System.out.println("Radius="+r);
        System.out.println("Area of circle="+Area);
        
    }   
    public static void main(String args[])
    {
        circle c=new circle();
        c.Area();
        c.display();
    }
            
    
    
    
}
