/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ReaderWriter_file {
    
    public static void main(String args[]) throws IOException 
    {
        System.out.print("Enter the  a string :\t");
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        try 
        {    
           FileWriter fw=new FileWriter("C:Java\\ReaderWriter.txt");    
           fw.write(str);    
           fw.close();    
          }
        catch(IOException e)
        {
            System.out.println(e);
        }    
        System.out.println("File write Successfully..."); 
        FileReader fr = null;
        int ch;
        try
        { 
            fr= new FileReader("C:Java\\ReaderWriter.txt.txt"); 
            while ((ch=fr.read())!= -1) 
            {
                System.out.print((char)ch);
            }
             fr.close();
        } 
        catch (IOException fe) 
        { 
            System.out.println("File not found"+fe); 
        } 
        System.out.println();
    }
}
