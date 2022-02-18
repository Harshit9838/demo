/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 14-02-2022
 *Time: 10:34 PM
 */

package com.example.demo.controller;

import com.example.demo.model.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginController {

    @FXML

    private TextField userNameTextField;

    @FXML

    private PasswordField passwordField;

    @FXML

    public Button loginButton;

    private final Logger logger;
    public LoginController() {
        logger = LoggerFactory.getLogger(HelloController.class);
    }

    @FXML


    public  void logIn() {
        String userName = userNameTextField.getText();
        String password = passwordField.getText();
        User user = new User(userName,password);
        System.out.println(user);
        logger.info("hello bro!!!");
    }
}
