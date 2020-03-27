/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_6;

/**
 *
 * @author HP
 */
import java.util.*;
interface student
{
    void read();
    void display();
    
}
interface mark
{
    void read();
    void display();
    
}

public class student_details implements student,mark

{
    String name;
    int roll;
    String cls;

     int mark1;

     int mark2;
     
     int mark3;


    @Override
    public void read()

      
    {
          Scanner s=new Scanner(System.in);
          
          System.out.println("enter the name of the student");
          name=s.next();

            System.out.println("enter the roll number");
            roll=s.nextInt();
         
            System.out.println("enter the class ");
            cls=s.next();
            
            System.out.println("enter the marks of the student");
            
            System.out.print("mark1  = ");


                 mark1=s.nextInt();


                 System.out.print("mark2 = ");

         
        mark2=s.nextInt();


                 System.out.print("mark2 = ");


                 mark3=s.nextInt();


        
   }

  
    @Override
         public void display()
           {

        
        System.out.println("STUDENT DETAILS");
        

        System.out.println("****************");


                System.out.println("Name : "+name);


                System.out.println("Roll No : "+roll);

 
                System.out.println("Class : "+cls);
       

         System.out.println("Mark1 : "+mark1);

 
                System.out.println("Mark2 : "+mark2);


                System.out.println("Mark3 : "+mark3);

 
                int total=(mark1+mark2+mark3);


                System.out.println("Total marks : "+total);
        

        double percentage=(total*100)/300;

        
        System.out.println("Percentage : "+percentage);


          }

   
        public static void main(String a[])
      

    {


                student_details S=new student_details();


                S.read();


                S.display();

 
       
    }


}
    

