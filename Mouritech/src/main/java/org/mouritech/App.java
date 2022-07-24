package org.mouritech;

import org.mouritech.codeanswers.Exercise6;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Exercise 6: String management" );
        Exercise6 exercise = new Exercise6();
        String result = exercise.processString("CODE");
        System.out.println("Final Result: " + result);
    }
}
