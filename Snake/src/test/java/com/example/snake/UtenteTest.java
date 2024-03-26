package com.example.snake;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtenteTest {


    @Test
    void userNameValid() {
        Utente amie = new Utente("albe@rto");
        assertTrue(amie.userNameValid("albeto-"));
    }
}