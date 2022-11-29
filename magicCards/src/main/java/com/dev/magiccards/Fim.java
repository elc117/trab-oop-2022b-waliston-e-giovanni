package com.dev.magiccards;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Fim extends Application {

    private static Stage stage;
    @FXML
    private Text nameField ;
    @FXML
    private Text pointsField;

    Game game = new Game();
    public Text getNameField() {
        return nameField;
    }


    public void setNameField(Text nameField) {
        nameField.setText(String.valueOf(game.showPontos()));
    }

    public Text getPointsField() {
        return pointsField;
    }

    public void setPointsField(Text pointsField) {
        this.pointsField = pointsField;
    }

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



}
