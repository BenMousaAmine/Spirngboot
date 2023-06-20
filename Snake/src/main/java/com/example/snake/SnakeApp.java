package com.example.snake;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class SnakeApp extends Application {
    @Override
        public void start(Stage stage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(SnakeApp.class.getResource("Login.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.getIcons().add(new Image("C:/snakeLogo.jpg"));
            stage.setTitle("Welcome to snake game");
            stage.setScene(scene);
            stage.show();

    }

    public static void main(String[] args) {

        launch();
    }
}
