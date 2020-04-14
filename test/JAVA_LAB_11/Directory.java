/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_LAB_11;

import java.io.*;


/**
 *
 * @author HP
 */
public class Directory {
    
    public static void main (String args[]) throws IOException      
    {  
        File f = new File ("c:/java/temp2");
        if (f.mkdir()) 
            System.out.println("created a directory"+f);
        else 
            System.out.println ("unable to create a directory"+f);  
    }  
    
}
