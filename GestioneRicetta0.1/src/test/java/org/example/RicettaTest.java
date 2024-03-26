package org.example;

import jdk.javadoc.internal.doclets.formats.html.IndexRedirectWriter;
import junit.framework.TestCase;

import java.util.*;

public class RicettaTest extends TestCase {

    public void testCostoTotale() {
        ingrediente ingred1 = new ingrediente("Farina" , 1.5);
        ingrediente ingred2 = new ingrediente("tomate" , 2.5);
        ingrediente ingred3 = new ingrediente("oil" , 1.7);
        Map<ingrediente, Double> ingredRice1 = new HashMap<ingrediente, Double>();

        ingredRice1.put(ingred1,1.2);
        ingredRice1.put(ingred2,2.4);
        ingredRice1.put(ingred3,5.1);
Ricetta carbo = new Ricetta("carbonara","buona",ingredRice1);
        System.out.println(carbo.toString());
        System.out.println(ingredRice1.toString());







    }
}