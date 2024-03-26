package com.example.orologio;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Date;

public class HelloController {
    private Date  date ;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


        int sec = date.getSeconds();
        int min = date.getMinutes();
        int hour = date.getHours();
        String time = "Time : " + hour + " : "+ min +" : " +  sec ;
        
        welcomeText.setText(time);

}