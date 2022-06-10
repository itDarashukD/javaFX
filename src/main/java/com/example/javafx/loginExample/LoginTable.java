package com.example.javafx.loginExample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;

@Component
public class LoginTable {

    public void startApp(Stage stage) {

        //table
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25,25,25,25));


        Text sceneTitle = new Text("Please login");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));

        Label userName = new Label("User Name");
        TextField userTextBox = new TextField();

        Label passwordLabel = new Label("Password : ");
        PasswordField passwordBox = new PasswordField();

        //add fields into table
        gridPane.add(sceneTitle,0,0,2,1);
        gridPane.add(userName,0,1);
        gridPane.add(userTextBox,1,1);
        gridPane.add(passwordLabel,0,2);
        gridPane.add(passwordBox,1,2);

        gridPane.setGridLinesVisible(true);  // visible of table lines (grid lines))

        //scene
        Scene scene = new Scene(gridPane,300,275);

        //Node
        //button
        Button button = new Button("Sign in");
        HBox hbButton = new HBox(10);
        hbButton.setAlignment(Pos.BOTTOM_RIGHT);
        hbButton.getChildren().add(button);

        //add button into table
        gridPane.add(hbButton,1,4);

        Text actionTarget = new Text();
        gridPane.add(actionTarget,1,6);

        //action after button clicked
        button.setOnAction(actionEvent -> {
            actionTarget.setFill(Color.FIREBRICK);
            actionTarget.setText("Sign in button pressed");

        });

        //stage
        stage.setTitle("JavaX Login form" );
        stage.setScene(scene);
        stage.show();
    }
}
