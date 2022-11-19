package com.dev.magiccards;

import javafx.application.Application;;

import javafx.application.Platform;
import javafx.beans.binding.BooleanBinding;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Optional;


public class Game extends Application {

    public Text points;
    public ImageView imageView;
    public Button dica;

    @FXML
    private String[] deck = {"abacaxi", "images/abacaxi.jpg",
            "avião", "images/aviao.jpg",
            "banana", "images/banana.jpg",
            "barco", "images/barco.jpg",
            "batata", "images/batata.jpg",
            "bicicleta", "images/bicicleta.jpg",
            "bola", "images/bola.jpg",
            "bolo", "images/bolo.jpg",
            "caneta", "images/caneta.jpg",
            "carro", "images/carro.jpg",
            "castanha", "images/castanha.jpg",
            "cilindro", "images/cilindro.jpg",
            "elefante", "images/elefante.jpg",
            "golfinho", "images/golfinho.jpg",
            "guaxinim", "images/guaxinim.jpg",
            "laranja", "images/laranja.jpg",
            "leite", "images/leite.jpg",
            "maçã", "images/maca.jpg",
            "macarrão", "images/macarrao.jpg",
            "morango", "images/morango.jpg",
            "moto", "images/moto.jpg",
            "panela", "images/panela.jpg",
            "pentágono", "images/pentagono.jpg",
            "pilha", "images/pilha.jpg",
            "quadro", "images/quadro.jpg",
            "tênis", "images/tenis.jpg",
            "triângulo", "images/triangulo.jpg",
            "tucano", "images/tucano.jpg",
    };

    public String[] getDeck(ImageView s) {
        return deck;
    }

    private static Stage stage;

    public static Stage getStage() {
        return stage;
    }

    public TextField palavra;
    private int i, pontos;

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int showPontos() {
        return this.pontos;
    }

    private Parent root;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader gameBoard = new FXMLLoader(Home.class.getResource("game.fxml"));
        Scene scene = new Scene(gameBoard.load(), 600, 600);
        stage.setTitle("GAME");
        stage.setScene(scene);
        stage.show();

    }


    @FXML
    public void conferePalavra() throws URISyntaxException, JSONException, IOException {

        
        String pt = points.getText();
        String p = palavra.getText();


        if (deck[i].equals(p)) {
            this.i = this.i + 2;
            palavra.setText("");
            dica.setDisable(true);
            Image image = new Image(getClass().getResource(deck[this.i + 1]).toURI().toString());
            imageView.setImage(image);
            this.pontos = this.pontos + 100;

            dica.setStyle("-fx-background-color: rgb(244,238,129); -fx-background-radius: 100px;");
            points.setText(String.valueOf(pontos));
            Register r = new Register();

        } else {
            Alert warning = new Alert(Alert.AlertType.WARNING);
            warning.setTitle("CUIDADO!");
            warning.setHeaderText("A palavra não corresponde à imagem!");
            warning.showAndWait();

            dica.setDisable(false);
            dica.setStyle("-fx-background-color: yellow; -fx-background-radius: 100px;");

        }

        if (pontos == 1000) {
            Alert askToEnd = new Alert(Alert.AlertType.CONFIRMATION);
            askToEnd.setTitle("AVISO!");
            askToEnd.setHeaderText("Jogador, você fez 1000 pontos!");
            askToEnd.setContentText("Deseja continuar a jogar ?");


            Optional<ButtonType> result = askToEnd.showAndWait();
            if (result.get().equals(ButtonType.CANCEL)) {
                try {
                    new Fim().start(new Stage());
                    stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                        @FXML
                        public void handle(WindowEvent windowEvent) {
                            Platform.exit();
                            Home.getStage().close();
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }


    }


    public void umaDica() {
        Alert dica = new Alert(Alert.AlertType.WARNING);

        dica.setTitle("DICA");
        dica.setHeaderText("A palavra possui " + deck[this.i].length() + " letras!");
        dica.showAndWait();
    }
}
