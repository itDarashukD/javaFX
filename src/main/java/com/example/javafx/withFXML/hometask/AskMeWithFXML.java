/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.javafx.withFXML.hometask;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

/**
 * @author Peggy Fisher
 */
public class AskMeWithFXML extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        File file = new File("src/main/java/com/example/javafx/withFXML/homeTask/FXMLhomeTask.fxml");
        URL url = file.toURI().toURL();
        Parent root = FXMLLoader.load(url);

        Scene scene = new Scene(root, 300, 275);
        stage.setTitle("Login with FXML");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
