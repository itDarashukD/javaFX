package com.example.javafx.buttons;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ButtonAndFields extends Application {

    public static void main(String[] args) {
        launch();
    }

    @SuppressWarnings("static-access")
    public void start(Stage stage) {

        stage.setTitle("Hello World!");

        Button button = new Button();
        button.setText("buttonn");

        Label label = new Label("i'm a label");
        TextField textField = new TextField("enter text here");
        Hyperlink hyperlink = new Hyperlink("i'm a hyperLink");
        RadioButton radioButton = new RadioButton("radioButton");
        CheckBox checkBox = new CheckBox("check box");
        ProgressBar progressBar = new ProgressBar();
        ScrollBar scrollBar = new ScrollBar();
        PasswordField passwordField = new PasswordField();

        GridPane gridPane = new GridPane(); //for place elements on pager
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(20);
        gridPane.setVgap(50);
        gridPane.setPadding(new Insets(25, 25, 25, 25));

        //add buttons to gris using columns and rows numbers
        gridPane.add(button, 0, 0);
        gridPane.add(label, 1, 0);
        gridPane.add(textField, 2, 0);
        gridPane.add(radioButton, 0, 1);
        gridPane.add(hyperlink, 2, 1);
        gridPane.add(checkBox, 1, 1);
        gridPane.add(progressBar, 0, 2);
        gridPane.add(scrollBar, 1, 2);
        gridPane.add(passwordField, 0, 3, 3, 1);

        Scene scene = new Scene(gridPane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}