/*program to create a file and write data into it using methods Outputstramclass
program No:12.1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_12;

import java.io.FileOutputStream;

/**
 *
 * @author HP
 */public class OutputStreamClass {
     
    public static void main(String args[])
    {
        try
        {    
             FileOutputStream f =new FileOutputStream("C:Java\\Write.txt");    
             String s="Welcome";    
             byte b[]=s.getBytes(); 
             f.write(b);    
             f.close();    
             System.out.println("File Created And Write Successfully");    
        }
        catch(Exception e)
            {
                System.out.println(e);
            }    
            
    }
  
    
}
