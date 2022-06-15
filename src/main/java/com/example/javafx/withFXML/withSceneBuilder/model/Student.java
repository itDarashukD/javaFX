package com.example.javafx.withFXML.withSceneBuilder.model;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String name;
    private String lastName;
    private String country;
    private String gender;
    private String password;

}
