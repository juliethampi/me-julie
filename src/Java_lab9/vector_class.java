/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_lab9;

/**
 *
 * @author MCALAB01029
 */import java.util.*;
public class vector_class {
    public static void main(String args[])
    {
        Vector v = new vector();
        v.add("1");
        v.add("2");
        v.add("3");
        System.out.println("getting elemts of vector");
        System.out.println(v.get(0));
        System.out.println(v.get(1));
        System.out.println(v.get(2));
                      
    }
    
}
