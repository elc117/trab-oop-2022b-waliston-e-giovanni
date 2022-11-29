package com.dev.magiccards;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Points extends Application {
    private static Stage stage;

    public static Stage getStage(){
        return stage;
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader points = new FXMLLoader(Home.class.getResource("recordes.fxml"));
        Scene scene = new Scene(points.load(), 600, 600);
        stage.setTitle("PONTUAÇÃO");
        stage.setScene(scene);
        stage.show();
        Points.stage = stage;
    }

    @FXML
    private void backToHomePage(ActionEvent event) {
        event.consume();

        try {
            new Home().start(new Stage());
            Points.getStage().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
