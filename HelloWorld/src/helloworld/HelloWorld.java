/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author lamw
 */
public class HelloWorld 
{

    /**
     * @param args the command line arguments
     */
    static int x = 20;
    static int y = 10;
    
    public static void main(String[] args) 
    {
       int count = 0;
        
       System.out.println ("Hello World!");
       System.out.println (x + y);
       System.out.println ("printing: " + x * y);
       
       for (int i = count; i < 11; ++i)
       {
            ++count;
       }
       
       System.out.println("Count is: " + count);
     }
   }

