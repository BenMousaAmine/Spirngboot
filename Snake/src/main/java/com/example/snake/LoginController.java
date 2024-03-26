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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    TextField username;

    @FXML
    Button btnLogin;
    @FXML
    Label status;
    @FXML
    Label register;


    public boolean isLogged(TextField username, ArrayList<Utente> Registrati) {
        for (Utente utente : Registrati) {
            if (utente.getUserName().equals(username.getText())) {
                return true;
            }
        }
        return false;
    }

    @FXML
    public void login(ActionEvent actionEvent) {
        Utente jouer1 = new Utente("amine");
        ArrayList<Utente> Registrati = new ArrayList<Utente>();
        Registrati.add(jouer1);
        if (isLogged(username, Registrati)) {
            status.setText("Login successful");
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
            RegisterController registerController = loader.getController();

            // Imposta eventuali dati o parametri nel controller dell'interfaccia successiva
            // registerController.setDati(...);

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}