package view;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.GarbageCollectorButton;


public class ViewManager {

    private static final int width = 1100;
    private static final int height = 600;

    private AnchorPane anchorPane;
    private Scene scene;
    private Stage stage;

    public ViewManager(){
        anchorPane = new AnchorPane();
        scene = new Scene(anchorPane, width, height);
        //Stage inicialization to prevent from NullPointerException
        stage = new Stage();
        stage.setScene(scene);
        createButton();
    }

    public Stage getStage(){
        return stage;
    }

    private void createButton(){
        GarbageCollectorButton garbageCollectorButton = new GarbageCollectorButton("Click Me!");
        anchorPane.getChildren().add(garbageCollectorButton);
    }

}
