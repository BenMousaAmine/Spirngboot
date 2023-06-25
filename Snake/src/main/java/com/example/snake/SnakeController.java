package com.example.snake;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.*;

public class SnakeController {
    @FXML
    public Rectangle header;
    @FXML
    public Circle snakeHead;
    @FXML
    public Rectangle snakeBody;
    public Pane rootPane;

    ArrayList<KeyCode> moves = new ArrayList<>();

    int MOVE_LENGTH = 10;
    boolean blockMovement = false;

    int i=0;

    @FXML
    public void initialize() {
        moves.add(KeyCode.LEFT);
    }

    private void autoMove() {
        Runnable moveRunnable = new Runnable() {
            public void run() {
                System.out.println("Auto" + (++i));
                move(moves.get(moves.size() - 1));
            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(moveRunnable, 1, 1, TimeUnit.SECONDS);
    }

    public void move(KeyEvent keyEvent) {
        move(keyEvent.getCode());
    }

    public void move(KeyCode key) {
        if(!blockMovement) {
            if(moves.size() == 1) {
                autoMove();
            }
            KeyCode lastMove = moves.get(moves.size() - 1);
            switch (key) {
                case LEFT:
                    if (lastMove == KeyCode.RIGHT && key == KeyCode.LEFT) {
                        break;
                    }
                case RIGHT:
                    if (lastMove == KeyCode.LEFT && key == KeyCode.RIGHT) {
                        break;
                    }
                case UP:
                    if (lastMove == KeyCode.DOWN && key == KeyCode.UP) {
                        break;
                    }
                case DOWN:
                    if (lastMove == KeyCode.UP && key == KeyCode.DOWN) {
                        break;
                    }
                    moveSnakeHead(key);
                    moveSnakeBody(lastMove);
                    moves.add(key);
                    checkObstacles();
                    break;
            }
        }
    }

    public void moveSnakeHead(KeyCode keyCode){
        KeyCode lastMove = moves.get(moves.size()-1);
        switch(keyCode){
            case LEFT:
                if(lastMove == KeyCode.UP){
                    snakeHead.setLayoutX(snakeHead.getLayoutX() - MOVE_LENGTH);
                    snakeBody.setLayoutY(snakeBody.getLayoutY() - MOVE_LENGTH);
                }
                if(lastMove == KeyCode.DOWN){
                    snakeHead.setLayoutX(snakeHead.getLayoutX() - MOVE_LENGTH);
                    snakeBody.setLayoutY(snakeBody.getLayoutY() + MOVE_LENGTH);
                }
                snakeHead.setLayoutX(snakeHead.getLayoutX() - MOVE_LENGTH);
                break;
            case RIGHT:
                if(lastMove == KeyCode.UP){
                    snakeHead.setLayoutX(snakeHead.getLayoutX() + MOVE_LENGTH);
                    snakeBody.setLayoutY(snakeBody.getLayoutY() - MOVE_LENGTH);
                }
                if(lastMove == KeyCode.DOWN){
                    snakeHead.setLayoutX(snakeHead.getLayoutX() + MOVE_LENGTH);
                    snakeBody.setLayoutY(snakeBody.getLayoutY() + MOVE_LENGTH);
                }
                snakeHead.setLayoutX(snakeHead.getLayoutX() + MOVE_LENGTH);
                break;
            case UP:
                if(lastMove == KeyCode.LEFT){
                    snakeHead.setLayoutX(snakeHead.getLayoutX() + MOVE_LENGTH);
                    snakeHead.setLayoutY(snakeHead.getLayoutY() - MOVE_LENGTH);
                }
                if(lastMove == KeyCode.RIGHT){
                    snakeHead.setLayoutX(snakeHead.getLayoutX() - MOVE_LENGTH);
                    snakeHead.setLayoutY(snakeHead.getLayoutY() - MOVE_LENGTH);
                }
                snakeHead.setLayoutY(snakeHead.getLayoutY() - MOVE_LENGTH);
                break;
            case DOWN:
                if(lastMove == KeyCode.LEFT){
                    snakeHead.setLayoutX(snakeHead.getLayoutX() + MOVE_LENGTH);
                    snakeHead.setLayoutY(snakeHead.getLayoutY() + MOVE_LENGTH);
                }
                if(lastMove == KeyCode.RIGHT) {
                    snakeHead.setLayoutX(snakeHead.getLayoutX() - MOVE_LENGTH);
                    snakeHead.setLayoutY(snakeHead.getLayoutY() + MOVE_LENGTH);
                }
                snakeHead.setLayoutY(snakeHead.getLayoutY() + MOVE_LENGTH);
                break;
        }
    }

    public void moveSnakeBody(KeyCode keyCode){
        switch(keyCode){
            case LEFT:
                snakeBody.setLayoutX(snakeBody.getLayoutX() - MOVE_LENGTH);
                break;
            case RIGHT:
                snakeBody.setLayoutX(snakeBody.getLayoutX() + MOVE_LENGTH);
                break;
            case UP:
                snakeBody.setLayoutY(snakeBody.getLayoutY() - MOVE_LENGTH);
                break;
            case DOWN:
                snakeBody.setLayoutY(snakeBody.getLayoutY() + MOVE_LENGTH);
                break;
        }
    }

    public void checkObstacles(){
        if(gameOver()){
            System.out.println("GAME OVER");
            blockMovement = true;
        }
    }

    public boolean gameOver(){
        double headY = snakeHead.getLayoutY() - snakeHead.getRadius();
        double headYDown = snakeHead.getLayoutY() + snakeHead.getRadius();
        double headX = snakeHead.getLayoutX() - snakeHead.getRadius();
        double headXRight = snakeHead.getLayoutX() + snakeHead.getRadius();
        double headerY = header.getLayoutY() + header.getHeight();
        double rootPaneX = rootPane.getWidth();
        double rootPaneY = rootPane.getHeight();
        if(headY < headerY){
            return true;
        }
        if(headX < 0) {
            return true;
        }
        if(headXRight > rootPaneX) {
            return true;
        }
        if(headYDown > rootPaneY) {
            return true;
        }
        return false;
    }

    public void reset(MouseEvent mouseEvent) {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("snake.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}