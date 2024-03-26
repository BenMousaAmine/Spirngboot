package com.example.snakejava;

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


public class LoginController {
    @FXML
    private TextField username;
    @FXML
    private Button btnLogin;
    @FXML
    private Label status;
    @FXML
    private Label register;


//invio dati login al server

    // metodi presente nel server
    public boolean isLogged(String username, ArrayList<Utente> registrati) {
        for (Utente utente : registrati) {
            if (utente.getUserName().equals(username.toUpperCase())) {
                return true;
            }
        }
        return false;
    }
// risposta
    @FXML
    public void login(ActionEvent actionEvent) {
        if (isLogged(username.getText(), Registrati)) {
            gameLayout();
        } else {
            status.setText("Username not found. Register");
        }
    }

    @FXML
    public void register(MouseEvent mouseEvent) {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Register.fxml"));
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
        Stage stage = (Stage) btnLogin.getScene().getWindow();
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
