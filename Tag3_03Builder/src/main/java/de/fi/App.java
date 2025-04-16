package de.fi;

import de.fi.math.Komplex;
import pojo.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


       Person person = Person
                .builder()
                .vorname("Jane")
                .nachname("Mustermann")
                .build();

        System.out.println( "Hello World!" );
    }
}
