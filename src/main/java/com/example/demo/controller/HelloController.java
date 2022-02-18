package com.example.demo.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HelloController {
    @FXML
    private Label welcomeText;


    private final Logger logger;

    public HelloController() {
        logger = LoggerFactory.getLogger(HelloController.class);
    }
    @FXML
    protected void onHelloButtonClick() {

        logger.info("Hello button click hua hai");
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}