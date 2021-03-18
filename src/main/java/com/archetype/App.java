package com.archetype;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Hello".isBlank());
    }

    public String getStr(final String entry) {
        return "Hello " + entry;
    }
}
