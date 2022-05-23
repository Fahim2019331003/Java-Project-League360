module com.example.league360 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.league360 to javafx.fxml;
    exports com.example.league360;
}