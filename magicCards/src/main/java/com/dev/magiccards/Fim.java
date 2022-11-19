package com.dev.magiccards;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Fim extends Application implements Initializable {

    private static Stage stage;
    public Text nameField;
    public Text pointsField;


    @FXML

    public static Stage getStage() {
        return stage;
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader endGame = new FXMLLoader(Home.class.getResource("fim.fxml"));
        Scene scene = new Scene(endGame.load(), 600, 600);
        stage.setTitle("FIM");
        stage.setScene(scene);
        stage.show();
        Fim.stage = stage;

    }

    @FXML
    private void playAgain(ActionEvent event) {
        event.consume();
        try {
            new Game().start(new Stage());
            Fim.getStage().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goHomeMenu(ActionEvent event) {
        event.consume();
        try {
            new Home().start(new Stage());
            Fim.getStage().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Game game = new Game();
            pointsField.setText(String.valueOf(game.getPontos()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
