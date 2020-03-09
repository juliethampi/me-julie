/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_lab1;

import java.util.*;

abstract public class Astract 
{
    abstract void read();
    abstract void volume();
}
class Cy extends Astract
{
    float r;
    float h;
    void read()
    {
        Scanner sc=new Scanner(System.in);
                r=sc.nextFloat();
                h=sc.nextFloat();
                
    }
    void volume()
    {
        double volume;
        volume=3.141*r*r*h;
        System.out.println("volume cylinder:" +volume);
    }
    
    }
class Cu extends Astract
{
    int a;
    void read()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the side of cube");
        a=sc.nextInt();
    }
    void volume()
    {
        int v;
        v=a*a;
        System.out.println("volume of cube="+v);
    }
    public static void main(String args[])
    {
        Astract s=new Cy();
        s.read();
        s.volume();
       Astract s1=new Cu();
        s1.read();
        s1.volume();
    }
}
