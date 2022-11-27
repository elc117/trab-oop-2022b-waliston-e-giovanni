package com.dev.magiccards;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class Fim extends Application {

    private static Stage stage;
    @FXML
    private Text nameField;
    @FXML
    private Text pointsField;

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
        defs();
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

    String nom;
    int testeq;

    private void defs() {
        try {

            Connection conexao = ConnectionFactory.createConnection();
            String sql = "select nome from Jogador where id = 1;";
            PreparedStatement comando = conexao.prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();
            resultado.getString("nome");
            conexao.close();
            nameField.setText(resultado.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
