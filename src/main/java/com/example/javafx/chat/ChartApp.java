package com.example.javafx.chat;

import com.example.javafx.JavaFxApplication;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

public class ChartApp extends Application {

    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init()   {
        applicationContext = new SpringApplicationBuilder(JavaFxApplication.class).run();
    }

    @Override
    public void start(Stage stage)   { // publisher created events
        applicationContext.publishEvent(new StageReadyEvent(stage));

    }

    @Override
    public void stop()  {
        applicationContext.close();
    }

    public static class StageReadyEvent extends ApplicationEvent {
        public StageReadyEvent(Stage stage) {
            super(stage);
        }

        public Stage getStage() {
            return (Stage) getSource();
        }
    }
}
