package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        Ricetta carbonara = new  Ricetta ();
        carbonara.setName("carbonara");
        Ricetta carbonara2 = new  Ricetta ();
        carbonara2.setName("carbonara");
        carbonara.setIngred(new String[]{"pasta", "Uova" ,"formaggio"} );
        System.out.println(  carbonara.equals( carbonara2) );


    }
}
