/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.javafx.withFXML.hometask;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

import java.awt.font.NumericShaper;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

/**
 *
 * @author Peggy Fisher
 */
public class FXMLAskMeController implements Initializable {

    @FXML
    public Text actionShowInstructions;

    @FXML
    public Text actionShowQuestion;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void showInstructions(ActionEvent actionEvent) {
        actionShowInstructions.setText("Please Ask me and push the button \n \"question for you\" !");
    }

    public void getQestion(ActionEvent actionEvent) {
        List<String > sentences = new ArrayList<>();
        sentences.add("first question");
        sentences.add("second question");
        sentences.add("third question");

        Random random = new Random();
        int i = random.nextInt(3);

        actionShowQuestion.setText(sentences.get(i));
    }
}
