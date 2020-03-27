/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_7;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class fibonacci_number {
    public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,n;
 System.out.println("enter length");
 Scanner s=new Scanner(System.in);
 n=s.nextInt();
 System.out.print(n1+" "+n2);   
    
 for(i=2;i<n;++i)
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  
    

