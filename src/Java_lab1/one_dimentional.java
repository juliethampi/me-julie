/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_lab1;

/**
 *
 * @author MCALAB01029
 */import java.util.*;
public class one_dimentional {
    
   public static void main (String args [])
{

        int a[]=new int[20];
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        n=sc.nextInt();
        System.out.println("enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.print("the array elemnts are:");
        System.out.println(a[i]);
        }
    }
   
   
}