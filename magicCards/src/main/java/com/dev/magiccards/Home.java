package com.dev.magiccards;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Home extends Application {
    private static Stage stage;


    public static Stage getStage(){
        return stage;
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader homePage = new FXMLLoader(Home.class.getResource("home.fxml"));
        Scene scene = new Scene(homePage.load(), 600, 600);
        stage.setTitle("HOME");
        stage.setScene(scene);
        stage.show();

        Home.stage = stage;
    }

    @FXML
    private void toRegister(ActionEvent event) {
        event.consume();
        try {
            new Register().start(new Stage());
            Home.getStage().close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void toRecods(ActionEvent event) {
        event.consume();
        try {
            new Points().start(new Stage());
            Home.getStage().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void exitProgram(ActionEvent event) {
        event.consume();
        System.exit(0);
    }
}
