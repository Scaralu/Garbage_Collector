package view;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Collector;

public class GameViewManager {
    private AnchorPane anchorPane;
    private Stage stage;
    private Scene gameScene;

    private static final int GAME_WIDTH = 1280;
    private static final int GAME_HEIGHT = 720;


    public GameViewManager() {
        initializeStage();
        initializeKeyListeners();
    }

    public void initializeStage(){
        anchorPane = new AnchorPane();
        gameScene = new Scene(anchorPane, GAME_WIDTH, GAME_HEIGHT);
        stage = new Stage();
        stage.setScene(gameScene);
    }

    public void initializeKeyListeners(){
        gameScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.SPACE){

                }else if (keyEvent.getCode() == KeyCode.UP){

                }
            }
        });


        gameScene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.SPACE){

                }else if (keyEvent.getCode() == KeyCode.UP){

                }
            }
        });
    }

    private void createNewGame(Stage stage, Collector collector){

    }

}
