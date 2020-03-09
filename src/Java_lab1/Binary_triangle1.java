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
public class Binary_triangle1 {
    public static void main(String args[])
    {
        int i,j,n;
        Scanner sc = new Scanner (System.in);
                System.out.println("enter the limit");
                n=sc.nextInt();
                System.out.println("the binary triangle is : ");
                for(i=1;i<=n+1;i++)
                {
                    System.out.println("1");
                    if(i==n)
                    {
                        break;
                        
                    }
                    System.out.print("1");
                    for(j=0;j<i;j++)
                    {
                        System.out.print("0");
                        
                    }
                }
                        
    }
    
}
