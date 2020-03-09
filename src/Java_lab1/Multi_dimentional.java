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
public class Multi_dimentional {
      public static void main(String args[])
    {
        int a[][][] =new int[10][20][30];
       int k,j,i,m,n,o;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the limit");
       m=sc.nextInt();
       System.out.println("enter the limit");
       n=sc.nextInt();
       System.out.println("enter the limit");
       o=sc.nextInt();
       System.out.println("enter the array elements");
       for(i=0;i<m;i++)
       {
           for(j=0;j<n;j++)
               {
                   for(k=0;k<o;k++)
                   {
                       a[i][j][k]=sc.nextInt();
                   }
               }
       }
       for(i=0;i<m;i++)
       {
           for(j=0;j<n;j++)
               {
                   for(k=0;k<o;k++)
                   {
                    System.out.print("\t"+a[i][j][k]);
                   }
                   System.out.println();
               }
       }
    }  
}

    
}
