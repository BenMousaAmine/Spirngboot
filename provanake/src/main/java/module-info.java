module com.example.provanake {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.provanake to javafx.fxml;
    exports com.example.provanake;
}