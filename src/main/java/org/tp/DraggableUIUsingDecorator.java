package org.tp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DraggableUIUsingDecorator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DecoratorUI.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setTitle("Mini Project");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}