package com.example.snake;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import static com.example.snake.UtenteRegistrati.Registrati;

public class RegisterController {
    @FXML
    TextField username ;
    @FXML
    Label status;
    @FXML
    private Button btnRegister;


    // metodo register che crea un nuovo utente e lo agguingi a l'arrayList
//
    @FXML
    public void register(ActionEvent actionEvent) {
        String inputUsername = username.getText();
        Utente jouer = new Utente(inputUsername);
        Registrati.add(jouer);
        //dati inviati al server
        status.setText("Username created successfully!");
        gameLayout() ;
    }



    //metodo per tornare al login
    public void goToLogin(MouseEvent mouseEvent) {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.getIcons().add(new Image("C:/snakeLogo.jpg"));
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void gameLayout() {
        Stage stage = (Stage) btnRegister.getScene().getWindow();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("layoutSnake.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.getIcons().add(new Image("C:/snakeLogo.jpg"));
            stage.setTitle("Snake");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
