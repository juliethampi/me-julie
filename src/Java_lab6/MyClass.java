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
interface A
{
    
    void meth1();
    void meth2();
    
}
public class MyClass implements A
{
    @Override
    public void meth1()
    {
       System.out.println("MCA");
       
    }
    @Override
    public void meth2()
    {
        System.out.println("LAB");
        
    }
    
    public static void main(String args[])
    {
        MyClass M=new MyClass();
        M.meth1();
        M.meth2();
               
    }
    
}
