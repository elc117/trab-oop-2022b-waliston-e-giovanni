module com.dev.magiccards {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dev.magiccards to javafx.fxml;
    exports com.dev.magiccards;
}