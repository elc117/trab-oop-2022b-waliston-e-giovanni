package com.dev.magiccards;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Register extends Application {

    @FXML
    public TextField nome;

    private static Stage stage;

    public static Stage getStage() {
        return stage;
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader singin = new FXMLLoader(Home.class.getResource("register.fxml"));
        Scene scene = new Scene(singin.load(), 600, 600);
        stage.setTitle("CADASTRO");
        stage.setScene(scene);
        stage.show();
        Register.stage = stage;

    }

    @FXML
    private void username(ActionEvent event) {
        try {
            new Game().start(new Stage());
            Register.getStage().close();

        }catch (Exception e) {
            e.printStackTrace();
        }

        event.consume();
        if (nome.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Campo Vazio");
            alert.setContentText("O campo nome, não pode estar vazio");
            alert.showAndWait();

        }
    }
}




















