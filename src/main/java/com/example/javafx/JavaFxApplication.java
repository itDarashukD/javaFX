package com.example.javafx;

import com.example.javafx.chat.ChartApp;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaFxApplication {

    public static void main(String[] args) {
        Application.launch(ChartApp.class, args);
    }

}
