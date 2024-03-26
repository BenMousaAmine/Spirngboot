package org.example;

import java.util.Date;

abstract public class Animal {
    protected String name ;
    protected Date dataNascita ;
    protected double peso ;


    public Animal() {
    }

    public Animal(String name, Date dataNascita, double peso) {
        this.setName(name);
        this.setDataNascita(dataNascita);
        this.setPeso(peso);
    }

    public String getName() {
        return name;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public double getPeso() {
        return peso;
    }

    public String setName(String name) {
       return this.name = name;
    }

    public Date setDataNascita(Date dataNascita) {
        return this.dataNascita = dataNascita;
    }

    public double setPeso(double peso) {
       return this.peso = peso;
    }
}
