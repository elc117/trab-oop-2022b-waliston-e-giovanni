package com.dev.magiccards;

import javafx.application.Application;;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class Game extends Application {

    String[] deck = {"abacaxi", "images/abacaxi.jpg",
            "avião", "images/aviao.jpg",
            "banana", "images/banana.jpg",
            "barco", "images/barco.jpg",
            "batata", "images/batata.jpg",
            "bicicleta", "images\bicicleta.jpg",
            "bola", "images\bola.jpg",
            "bolo", "images\bolo.jpg",
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

    public TextField palavra;
    int i;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader gameBoard = new FXMLLoader(Home.class.getResource("game.fxml"));
        Scene scene = new Scene(gameBoard.load(), 600, 600);
        stage.setTitle("GAME");
        stage.setScene(scene);
        stage.show();
    }

    public void conferePalavra() {

        String p = palavra.getText();

        if (deck[i].equals(p)) {
            i = i + 2;
            System.out.println("E igual");
        } else {
            Alert warning = new Alert(Alert.AlertType.WARNING);
            warning.setTitle("CUIDADO!");
            warning.setHeaderText("CAMPOS INVÁLIDO");
            warning.setContentText("A palavra não corresponde à imagem!");
            warning.showAndWait();
        }
    }
}
