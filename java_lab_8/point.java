/*program No:8.1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_8;

/**
 *
 * @author HP
 */import java.util.*;
public class point {
    private int x,y;
 public point()
 {
 
 }
  public point(int x, int y)
 {
     this.x=x;
     this.y=y;
 }
 public void setX(int x)
 {
     this.x=x;
     System.out.println("value of x = "+x);
 }
 public void setY(int y)
 {
    this.y=y;
    System.out.println("value of y  = "+y);
 }
   
 public void setXY(int x,int y)
 {
     this.x=x;
     this.y=y;
     System.out.println("Multiplication of x and y = "+(x*y));
 }
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of x");
     int x=sc.nextInt();
     System.out.println("Enter the value of y");
     int y=sc.nextInt();
     point P=new point(x,y);
     P.setX(x);
     P.setY(y);
     P.setXY(x,y);
 }
}
    

