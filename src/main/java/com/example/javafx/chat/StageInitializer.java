package com.example.javafx.chat;

import static com.example.javafx.chat.ChartApp.*;

import com.example.javafx.LoginEmaple.LoginTable;
import com.example.javafx.chat.ColorRectangl.ColoredRectangle;

import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;

import org.springframework.stereotype.Component;


@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent> {  //will be listen StageReadyEvent events from ChartsApp.class

    @Autowired
    private ColoredRectangle coloredRectangle;
    @Autowired
    private LoginTable loginTable;

    @Override
    public void onApplicationEvent(StageReadyEvent event) {

        Stage stage = event.getStage();

//        coloredRectangle.startApp(stage);
        loginTable.startApp(stage);

    }
}
