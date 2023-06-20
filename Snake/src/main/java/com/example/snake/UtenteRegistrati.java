package com.example.snake;

import java.util.ArrayList;

public class UtenteRegistrati {
  static ArrayList<Utente> Registrati = new ArrayList<Utente>() ;

    public UtenteRegistrati() {
        ArrayList<Utente> Registrati = new ArrayList<Utente>() ;
    }

    public ArrayList<Utente> getRegistrati() {

        return Registrati;

    }

    public void setRegistrati(Utente utente) {

        Registrati.add(utente) ;
    }



}
