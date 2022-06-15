/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.javafx.withFXML.withSceneBuilder.controller;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLMainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button enter_button;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button registry_button;

    @FXML
    void initialize() throws Exception {
        enter_button.setOnAction(actionEvent -> {
            String loginText = login.getText().trim();
            String passwordText = password_field.getText().trim();

            if (loginText.isBlank() || passwordText.isBlank()) {
                System.out.println("the login or password is blank, please enter some values");
            }else {
                loginUser(loginText,passwordText);
            }


        });

        registry_button.setOnAction(actionEvent -> {
            registry_button.getScene().getWindow().hide();

            try {
                File file = new File("src/main/java/com/example/javafx/withFXML/withSceneBuilder/fxml/Registry.fxml");

                URL url = file.toURI().toURL();
                Parent root = FXMLLoader.load(url);

                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.showAndWait();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        });

    }

    private void loginUser(String loginText, String passwordText) {

    }

}
