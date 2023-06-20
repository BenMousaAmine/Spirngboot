package com.example.snake;

import java.util.Locale;

public class Utente {

    private  String userName ;
    private  int highScore ;

    public Utente(String userName) {
        this.setUserName(userName);
        this.highScore=0 ;
    }

    public String getUserName() {
        return userName;
    }

    public boolean userNameValid(String username) {

        if (username.matches("[a-zA-Z0-9_]+")) {
            if (!username.contains(" ")) {
                return true; // Username valido
            }
        }
        return false;
    }

    public void setUserName(String userName) {
        if(userNameValid(userName)){
            this.userName = userName.toUpperCase();
        }

    }


    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }
}
