package com.dev.magiccards;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import java.util.Optional;



public class btns {

    public void btn400() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        alert.setTitle("Parabéns Jogador!!!");
        alert.setHeaderText("Você já fez 400 pontos!");
        alert.setContentText("Gostaria de continuar?");

        ButtonType buttonTypeYES = new ButtonType("YES");
        ButtonType buttonTypeNO = new ButtonType("NÃO");

        alert.getButtonTypes().setAll(buttonTypeYES, buttonTypeNO);

        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == buttonTypeNO) {


            try {


                new Fim().start(new Stage());
                Game.getStage().hide();
                Game.getStage().getScene().getWindow().hide();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void btn700() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        alert.setTitle("Parabéns Jogador!!!");
        alert.setHeaderText("Você já fez 700 pontos!");
        alert.setContentText("Gostaria de continuar?");

        ButtonType buttonTypeYES = new ButtonType("YES");
        ButtonType buttonTypeNO = new ButtonType("NÃO");

        alert.getButtonTypes().setAll(buttonTypeYES, buttonTypeNO);

        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == buttonTypeNO) {
            try {
                Game.getStage().getScene().getWindow().hide();
                new Fim().start(new Stage());
                Game.getStage().hide();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void btn1000() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        alert.setTitle("Parabéns Jogador!!!");
        alert.setHeaderText("Você já fez 1000 pontos!");
        alert.setContentText("Gostaria de continuar?");

        ButtonType buttonTypeYES = new ButtonType("YES");
        ButtonType buttonTypeNO = new ButtonType("NÃO");

        alert.getButtonTypes().setAll(buttonTypeYES, buttonTypeNO);

        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == buttonTypeNO) {
            try {
                Game.getStage().getScene().getWindow().hide();
                new Fim().start(new Stage());
                Game.getStage().hide();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void btn8000() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        alert.setTitle("Parabéns Jogador!!!");
        alert.setHeaderText("Você já fez 8000 pontos!");
        alert.setContentText("Gostaria de continuar?");

        ButtonType buttonTypeYES = new ButtonType("YES");
        ButtonType buttonTypeNO = new ButtonType("NÃO");

        alert.getButtonTypes().setAll(buttonTypeYES, buttonTypeNO);

        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == buttonTypeNO) {
            try {
                Game.getStage().getScene().getWindow().hide();
                new Fim().start(new Stage());
                Game.getStage().hide();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
