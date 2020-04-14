/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_LAB_11;

import java.io.File;

/**
 *
 * @author HP
 */
public class Rename_File {
    public static void main(String args[])
  {       
        File f = new File("c:\\java","renamefile");  
        File f1 = new File("c:\\java\\abc"); 
        if (f.exists())  
        {    
            System.out.println(f + " does exists.");
            System.out.println("Its size is" + f.length()+ "bytes"); 
            f.renameTo(f1);
            System.out.println("Renamed file name :" + f1 );  
            //System.out.println("deleting the renamed file"+f1);      
            //f.delete(); 
        }  
        else
            System.out.println(f +" does not exists"); 
   }                          

    
}
