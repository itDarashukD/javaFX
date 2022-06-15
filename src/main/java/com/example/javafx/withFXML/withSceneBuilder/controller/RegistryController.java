package com.example.javafx.withFXML.withSceneBuilder.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.javafx.withFXML.withSceneBuilder.model.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField LastName;

    @FXML
    private TextField country;

    @FXML
    private CheckBox female;

    @FXML
    private TextField login;

    @FXML
    private CheckBox male;

    @FXML
    private TextField name;

    @FXML
    private TextField password;

    @FXML
    private Button registryButton;

    @FXML
    void initialize() {

        registryButton.setOnAction(actionEvent -> {

            Student student1 = Student.builder()
                    .password("pass")
                    .country("bel")
                    .gender("MALE")
                    .lastName("doro")
                    .name("dima")
                    .build();

            //repository.add(student1)
        });
    }
}
