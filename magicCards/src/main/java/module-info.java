module com.dev.magiccards {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.json;

    opens com.dev.magiccards to javafx.fxml;
    exports com.dev.magiccards;
}