
package Java_lab1;


import java.util.*;
abstract class Simple_abstract 
{
    abstract void read();
    abstract void volume();
}
class cylinder extends Simple_abstract
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
class cube extends Simple_abstract
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
        v=a*a*a;
        System.out.println("volume of cube="+v);
    }
    public static void main(String args[])
    {
        simple_abstract s=new cylinder();
        s.read();
        s.volume();
        Simple_abstract s1=new cube();
        s1.read();
        s1.volume();
    }
}
