module com.example.snakeporject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.snakeporject to javafx.fxml;
    exports com.example.snakeporject;
}