/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

/**
 *
 * @author MCALAB01029
 */import java.util.*;
public class CIRCLE {
    public double r;
    public double pi=3.141;
    public void read()
    {
        Scanner sc=new Scanner(System.in);
                System.out.println("radius of a circle:");
                r=sc.nextDouble();
                
    }
public static void main(String args[])
{
    CIRCLE s=new CIRCLE();
    s.read();
}

    
}
