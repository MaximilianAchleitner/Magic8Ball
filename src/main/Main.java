package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import welcomescreen.WelcomeController;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       WelcomeController.show(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
