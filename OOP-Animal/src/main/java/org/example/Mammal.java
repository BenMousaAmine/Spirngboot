package org.example;

import java.util.Date;

public class Mammal extends Animal {
    protected static int zampe ;

    public Mammal(String name, Date dataNascita, double peso) {
        super(name, dataNascita, peso);
    }

    public Mammal() {
    }


    public static int getZampe() {
        return zampe;
    }

    public void makeNoise (){
        System.out.println ("Ciao")  ;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", dataNascita=" + dataNascita +
                ", peso=" + peso +
                '}' +", Zampe = " +zampe;
    }
}
