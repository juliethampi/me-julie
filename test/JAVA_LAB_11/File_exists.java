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
public class File_exists {
    public static void main(String args[ ] )       
    {  
        File f1 = new File( "c:\\java", "Julie_Thampi");
        System.out.println("File name :" + f1.getName()); 
        System.out.println("path :" + f1.getPath());
        System.out.println("Absolute path :"+f1.getAbsolutePath());  
        System.out.println(f1.exists() ? "file exists"  : "file does not exists");
        System.out.println(f1.isDirectory() ? "file is a directory"  : "file is not a directory");
        System.out.println(f1.isFile()? "file is an ordinary file"  :  "file may be a named pipe") ;  
    }   
    
}
