module com.example.zoofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zoofx to javafx.fxml;
    exports com.example.zoofx;
}