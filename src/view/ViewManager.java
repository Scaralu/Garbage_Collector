package view;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import model.GarbageCollectorButton;

import java.util.ArrayList;
import java.util.List;


public class ViewManager {

    private static final int width = 1280;
    private static final int height = 720;

    private static final int MENU_BUTTONS_START_X = 1050;
    private static final int MENU_BUTTONS_START_Y = 200;

    List<GarbageCollectorButton> menuButtons;

    private AnchorPane anchorPane;
    private Scene scene;
    private Stage stage;

    public ViewManager() {
        menuButtons = new ArrayList<>();
        anchorPane = new AnchorPane();
        scene = new Scene(anchorPane, width, height);
        //Stage inicialization to prevent from NullPointerException
        stage = new Stage();
        stage.setScene(scene);
        createButton();
        createBackground();
        createLogo();
    }

    public Stage getStage() {
        return stage;
    }

    private void addMenuButton(GarbageCollectorButton garbageCollectorButton) {
        garbageCollectorButton.setLayoutX(MENU_BUTTONS_START_X);
        garbageCollectorButton.setLayoutY(MENU_BUTTONS_START_Y + menuButtons.size() * 100);
        menuButtons.add(garbageCollectorButton);
        anchorPane.getChildren().add(garbageCollectorButton);
    }

    private void createButton() {
        createStartButton();
        createScoresButton();
        createHelpButton();
        createCreditsButtons();
        createExitButton();
    }

    private void createStartButton() {
        GarbageCollectorButton startButton = new GarbageCollectorButton("PLAY");
        addMenuButton(startButton);
    }

    private void createScoresButton() {
        GarbageCollectorButton scoreButton = new GarbageCollectorButton("SCORE");
        addMenuButton(scoreButton);
    }

    private void createHelpButton() {
        GarbageCollectorButton helpButton = new GarbageCollectorButton("HELP");
        addMenuButton(helpButton);
    }

    private void createCreditsButtons() {
        GarbageCollectorButton creditsButton = new GarbageCollectorButton("CREDITS");
        addMenuButton(creditsButton);
    }

    private void createExitButton() {
        GarbageCollectorButton exitButton = new GarbageCollectorButton("EXIT");
        addMenuButton(exitButton);
    }

    private void createBackground() {
        Image backgroundImage = new Image("view/resource/garbageCollectorBg.jpg", 1280, 720, false, true);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, null);
        anchorPane.setBackground(new Background(background));
    }

    private void createLogo(){
        ImageView logoImage = new ImageView("view/resource/runner.png");
        logoImage.setLayoutX(1000);
        logoImage.setLayoutY(10);
        logoImage.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                logoImage.setEffect(new DropShadow());
            }
        });
        logoImage.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                logoImage.setEffect(null);
            }
        });
        anchorPane.getChildren().add(logoImage);
    }
}
