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
public class Max_Array {
    public static void main(String[] args)
  {
      int i;
      int[] a=new int [20];
    Scanner s=new Scanner(System.in); 
    System.out.println("array size");
    int n=s.nextInt();
    System.out.println("array elements");
    for(i=0;i<n;i++)
    {
        a[i]=s.nextInt();
    }
   
    int max = recursiveMax(a, a.length);
    System.out.println("Maximum element: " + max);
  }
 
  static int recursiveMax(int[] arr, int length)
  {
    if (length == 1)
      return arr[0];
    return max(recursiveMax(arr, length - 1), arr[length - 1]);
  }
 
  private static int max(int n1, int n2)
  {
    return n1 > n2 ? n1 : n2;
  }	
}
    

