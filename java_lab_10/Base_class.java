/*Write a program to illustrate sub class exception precedence over base
class
program No:10.3
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_10;

/**
 *
 * @author HP
 */import java.util.*;
public class Base_class {
    void sum()
    {
        int a,b,s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  value :\t");
        a = sc.nextInt();
        System.out.print("Enter the value :\t");
        b = sc.nextInt();
        s=a/b;
        System.out.println("Result = "+s);
    }
}
class DerivedClass extends Base_class
{
    void sum()
    {
        Scanner sc = new Scanner(System.in);
        int limit;
        System.out.println("Enter the array limit");          
        limit = sc.nextInt();
        int a[]=new int[limit];
        
        System.out.println(" Enter the Array Elements : ");
        for(int i=0;i<limit;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println(" Array Elements : ");
        for(int i=0;i<limit;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String arg[])     
    {
        Base_class b=new DerivedClass();
        try    
        {
            b.sum();
        } 
        catch(Exception e)
        {
           System.out.println(" generated exception : " + e);        
        }      
        System.out.println(" After the try block"); 
    }
    
}
