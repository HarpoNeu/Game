package game;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application {

    public void start(Stage primaryStage)
    {
        Group grp = new Group();

        Scene scene = new Scene(grp, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Game");
        primaryStage.show();
    }

    public static void main(String args[])
    {
        launch(args);
    }
}