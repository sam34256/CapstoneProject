package com.example.capstoneproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CustomerController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hello!");
    }
}