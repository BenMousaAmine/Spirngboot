package org.example;

import junit.framework.TestCase;

public class RicettaTest extends TestCase {

    public void testTestEquals() {
        Ricetta carbonara = new  Ricetta ();
        carbonara.setName("carbonara");
        Ricetta carbonara2 = new  Ricetta ();
        carbonara2.setName("CARBONARA");
        carbonara.setIngred(new String[]{"pasta", "Uova" ,"formaggio"} );
        carbonara2.setIngred(new String[]{"pasta", "Uova" ,"formaggio"} );
        System.out.println(  carbonara.equals( carbonara2) );
    }
}