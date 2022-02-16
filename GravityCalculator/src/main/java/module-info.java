module com.example.gravitycalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gravitycalculator to javafx.fxml;
    exports com.example.gravitycalculator;
}