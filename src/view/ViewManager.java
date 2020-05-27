package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import model.*;
import model.characters.*;

import java.util.ArrayList;
import java.util.List;


public class ViewManager {

    private static final int width = 1280;
    private static final int height = 720;

    private static final int MENU_BUTTONS_START_X = 1050;
    private static final int MENU_BUTTONS_START_Y = 200;

    List<GarbageCollectorButton> menuButtons;
    List<CollectorPicker> collectorPickers;
    List<Collector> collectors;

    private GarbageCollectorSubscene sceneToHide;
    private GarbageCollectorSubscene characterSubScene;
    private GarbageCollectorSubscene scoreSubScene;
    private GarbageCollectorSubscene helpSubScene;
    private GarbageCollectorSubscene creditSubScene;

    private GameViewManager gameViewManager = new GameViewManager();
    private AnchorPane anchorPane;
    private Scene scene;
    private Stage stage;

    public Collector choosenCollector;

    public ViewManager() {
        menuButtons = new ArrayList<>();
        anchorPane = new AnchorPane();
        scene = new Scene(anchorPane, width, height);
        stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Garbage Collector");
        createSubScene();
        createButton();
        createBackground();
        createLogo();
    }

    public Stage getStage() {
        return stage;
    }

    private void showSubScene(GarbageCollectorSubscene garbageCollectorSubscene){
        if (sceneToHide != null){
            sceneToHide.moveSubScene();
        }
        garbageCollectorSubscene.moveSubScene();
        sceneToHide = garbageCollectorSubscene;
    }

    private void createSubScene(){

        createCollectorChosenSubScene();

        creditSubScene = new GarbageCollectorSubscene();
        anchorPane.getChildren().add(creditSubScene);

        scoreSubScene = new GarbageCollectorSubscene();
        anchorPane.getChildren().add(scoreSubScene);

        helpSubScene = new GarbageCollectorSubscene();
        anchorPane.getChildren().add(helpSubScene);
    }


    private void createCollectorChosenSubScene(){
        characterSubScene = new GarbageCollectorSubscene();
        anchorPane.getChildren().add(characterSubScene);

        InfoLabel chooseCollectorLabel = new InfoLabel("CHOOSE YOUR COLLECTOR");
        chooseCollectorLabel.setLayoutX(230);
        chooseCollectorLabel.setLayoutY(0);

        characterSubScene.getPane().getChildren().add(chooseCollectorLabel);
        characterSubScene.getPane().getChildren().add(createCollectorToChoose());
        characterSubScene.getPane().getChildren().add(createButtonToStart());

    }

    private HBox createCollectorToChoose(){
        HBox hBox = new HBox();
        hBox.setSpacing(400);

        collectors = new ArrayList<>();
        collectors.add(new TrashKing(192, 192));
        collectors.add(new BlueTrashKing(192, 192));

        collectorPickers = new ArrayList<>();
        for (Collector collector : collectors){
            CollectorPicker collectorToPick = new CollectorPicker(collector);
            collectorPickers.add(collectorToPick);
            hBox.getChildren().add(collectorToPick);
            collectorToPick.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    for (CollectorPicker collectorPicker : collectorPickers){
                        collectorPicker.setCircleChoosen(false);
                    }
                    collectorToPick.setCircleChoosen(true);
                    choosenCollector = collectorToPick.getCollector();
                }
            });
        }
        hBox.setLayoutX(300 - (118*2));
        hBox.setLayoutY(150);
        return hBox;
    }

    private GarbageCollectorButton createButtonToStart(){
        GarbageCollectorButton startButton = new GarbageCollectorButton("Start");
        startButton.setLayoutX(350);
        startButton.setLayoutY(500);

        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gameViewManager.createNewGame(stage, choosenCollector);
            }
        });

        return startButton;
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
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                showSubScene(characterSubScene);
            }
        });
    }

    private void createScoresButton() {
        GarbageCollectorButton scoreButton = new GarbageCollectorButton("SCORE");
        addMenuButton(scoreButton);

        scoreButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                showSubScene(scoreSubScene);
            }
        });
    }

    private void createHelpButton() {
        GarbageCollectorButton helpButton = new GarbageCollectorButton("HELP");
        addMenuButton(helpButton);

        helpButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                showSubScene(helpSubScene);
            }
        });
    }

    private void createCreditsButtons() {
        GarbageCollectorButton creditsButton = new GarbageCollectorButton("CREDITS");
        addMenuButton(creditsButton);

        creditsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                showSubScene(creditSubScene);
            }
        });
    }

    private void createExitButton() {
        GarbageCollectorButton exitButton = new GarbageCollectorButton("EXIT");
        addMenuButton(exitButton);

        exitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
            }
        });
    }


    private void createBackground() {
        Image backgroundImage = new Image("view/resource/menuImage.png", 1300, 740, false, true);
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
