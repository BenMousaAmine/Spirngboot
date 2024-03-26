module com.example.snakejava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.snakejava to javafx.fxml;
    exports com.example.snakejava;
}