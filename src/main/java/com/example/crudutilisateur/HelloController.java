package com.example.crudutilisateur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

     @FXML
     private Button connexion;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void connexion(ActionEvent actionEvent) {
        HelloApplication.changeScene("accueil");
    }


    public void inscription(ActionEvent actionEvent) {
        HelloApplication.changeScene("inscription");

    }

    public void MotDePasseOublié(ActionEvent actionEvent) {
        HelloApplication.changeScene("MDPoublie");
    }
}