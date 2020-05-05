package view;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import model.GarbageCollectorButton;

import java.util.ArrayList;
import java.util.List;


public class ViewManager {

    private static final int width = 1280;
    private static final int height = 720;

    private static final int MENU_BUTTONS_START_X = 100;
    private static final int MENU_BUTTONS_START_Y = 150;

    List<GarbageCollectorButton> menuButtons;

    private AnchorPane anchorPane;
    private Scene scene;
    private Stage stage;

    public ViewManager(){
        menuButtons = new ArrayList<>();
        anchorPane = new AnchorPane();
        scene = new Scene(anchorPane, width, height);
        //Stage inicialization to prevent from NullPointerException
        stage = new Stage();
        stage.setScene(scene);
        createButton();
        createBackground();
    }

    public Stage getStage(){
        return stage;
    }

    private void addMenuButton(GarbageCollectorButton garbageCollectorButton){
        garbageCollectorButton.setLayoutX(MENU_BUTTONS_START_X);
        garbageCollectorButton.setLayoutY(MENU_BUTTONS_START_Y + menuButtons.size() * 100);
        menuButtons.add(garbageCollectorButton);
        anchorPane.getChildren().add(garbageCollectorButton);
    }

    private void createButton(){
        createStartButton();
        createScoresButton();
        createHelpButton();
        createCreditsButtons();
        createExitButton();
    }

    private void createStartButton(){
        GarbageCollectorButton startButton = new GarbageCollectorButton("Play");
        addMenuButton(startButton);
    }

    private void createScoresButton(){
        GarbageCollectorButton scoreButton = new GarbageCollectorButton("Score");
        addMenuButton(scoreButton);
    }

    private void createHelpButton(){
        GarbageCollectorButton helpButton = new GarbageCollectorButton("Help");
        addMenuButton(helpButton);
    }

    private void createCreditsButtons(){
        GarbageCollectorButton creditsButton = new GarbageCollectorButton("Credits");
        addMenuButton(creditsButton);
    }

    private void createExitButton(){
        GarbageCollectorButton exitButton = new GarbageCollectorButton("Exit");
        addMenuButton(exitButton);
    }

    private void createBackground(){
        Image backgroundImage = new Image("view/resource/garbageCollectorBg.jpg", 1280, 720, false, true);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, null);
        anchorPane.setBackground(new Background(background));
    }
}
