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
       int [] nums = {0, 4, 5};
       
       System.out.println ("Hello World!");
       System.out.println (x + y);
       System.out.println ("printing: " + x * y);
       
       for (int i = count; i < 10; ++i)
       {
            ++count;
       }
       
       System.out.println("Count is: " + count);
       System.out.println ("Print contents of nums array: ");
       for (int i = 0; i < 3; ++i)
       {
           System.out.println(nums[i]);
       }
       
     }
   }

