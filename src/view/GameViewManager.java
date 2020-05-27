package view;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.SmallInfoLabel;
import model.characters.Collector;
import javafx.scene.image.ImageView;
import model.characters.SpriteAnimation;

import java.util.Random;

public class GameViewManager {
    private AnchorPane anchorGamePane;
    private Stage stage;
    private Stage menuStage;
    private Scene gameScene;
    private Collector choosenCollector;
    private SmallInfoLabel smallInfoLabel;
    private AnimationTimer gameTimer;
    Random randomPositionGenerator;

    private ImageView bonus;
    public ImageView collector;
    private ImageView[] trash;
    private static final String trash_image = "view/resource/bananona.jpg";
    private ImageView[] obstacles;
    private static final String obstacle_image = "view/resource/trashzao.png";

    private static final String bonus_trash = "view/resource/bananona.jpg";
    private int points;
    public int countKeyPressed = 0;


    //Animation parameters
    private static final int COLUMNS  =   10;
    private static final int COUNT    =  10;
    private static final int OFFSET_X =  0;
    private static final int OFFSET_Y =  0;
    private static final int WIDTH    = 192;
    private static final int HEIGHT   = 192;

    private static final int GAME_WIDTH = 1280;
    private static final int GAME_HEIGHT = 230;


    public GameViewManager() {
        initializeStage();
        initializeKeyListeners();
        randomPositionGenerator = new Random();
    }

    public void initializeStage(){
        anchorGamePane = new AnchorPane();
        gameScene = new Scene(anchorGamePane, GAME_WIDTH, GAME_HEIGHT);
        stage = new Stage();
        stage.setScene(gameScene);
    }

    public void initializeKeyListeners(){
        gameScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.SPACE && countKeyPressed == 0){
                    anchorGamePane.getChildren().remove(collector);
                    collector.setViewport(new Rectangle2D(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT));
                    final Animation animation = new SpriteAnimation(
                            collector = new ImageView(choosenCollector.getSprintSpriteSheet()),
                            Duration.millis(600),
                            COUNT, COLUMNS,
                            OFFSET_Y, OFFSET_X,
                            WIDTH, HEIGHT
                    );
                    animation.setCycleCount(Animation.INDEFINITE);
                    anchorGamePane.getChildren().add(collector);
                    animation.play();
                    countKeyPressed++;
                }else if (keyEvent.getCode() == KeyCode.SPACE && countKeyPressed >=1){
                    collector.setTranslateY(collector.getTranslateY() - 35);
                }else if (keyEvent.getCode() == KeyCode.UP){
                    collector.setTranslateY(collector.getTranslateY() - 35);
                }
            }
        });


        gameScene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.SPACE && countKeyPressed >= 1){
                    collector.setTranslateY(collector.getTranslateY() + 35);
                } else if (keyEvent.getCode() == KeyCode.UP){
                    collector.setTranslateY(collector.getTranslateY() + 35);
                }
            }
        });
    }

    public void createNewGame(Stage stage, Collector choosenCollector){
        this.choosenCollector = choosenCollector;
        this.menuStage = stage;
        this.menuStage.hide();

        stage.setResizable(false);
        stage.setTitle("Garbage Collector");

        createCollector(choosenCollector);
        createGameElements(choosenCollector);
        createBackground();
        createGameLoop();

        this.stage.show();
    }

    public void createCollector(Collector choosenCollector) {
        collector = new ImageView(choosenCollector.getStaticCharacterImage());
        collector.setLayoutX(300);
        collector.setLayoutY(130);
        anchorGamePane.getChildren().add(collector);
        initializeKeyListeners();
    }

    private void createBackground() {
        Image backgroundImage = new Image("view/resource/mapa.png", 1614, 230, false, true);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, null);
        anchorGamePane.setBackground(new Background(background));
    }

    private void createGameLoop(){
        gameTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            }
        };
        gameTimer.start();
    }

    private void setNewElementPosition(ImageView imageView){
        imageView.setLayoutX(randomPositionGenerator.nextInt(1500));
        imageView.setLayoutY(randomPositionGenerator.nextInt(100));
    }

    private void moveGameElements(){
        bonus.setLayoutX(bonus.getLayoutX() - 5);



        for (int i = 0; i < trash.length ; i++) {
            trash[i].setLayoutX(trash[i].getLayoutX() - 10);
            trash[i].setRotate(trash[i].getRotate() + 4);
        }

        for (int i = 0; i < obstacles.length ; i++) {
            trash[i].setLayoutX(trash[i].getLayoutX() - 10);
            trash[i].setRotate(trash[i].getRotate() + 4);
        }
    }

    private void checkElementPosition(){

        if (bonus.getLayoutX() < 1){
            setNewElementPosition(bonus);
        }

        for (int i = 0; i < trash.length; i++) {
            if (trash[i].getLayoutX() < 1){
                setNewElementPosition(trash[i]);
            }
        }
        for (int i = 0; i < obstacles.length; i++) {
            if (obstacles[i].getLayoutX() < 1) {
                setNewElementPosition(obstacles[i]);
            }
        }
    }

    private void createGameElements(Collector collector){
        bonus = new ImageView(bonus_trash);
        setNewElementPosition(bonus);
        anchorGamePane.getChildren().add(bonus);
        smallInfoLabel = new SmallInfoLabel("POINTS : 00");
        smallInfoLabel.setLayoutX(100);
        smallInfoLabel.setLayoutY(20);

        anchorGamePane.getChildren().add(smallInfoLabel);


        trash = new ImageView[3];
        for (int i = 0; i < trash.length ; i++) {
            trash[i] = new ImageView(trash_image);
            trash[i].setTranslateX(100);
            trash[i].setTranslateY(100);

            setNewElementPosition(trash[i]);
            anchorGamePane.getChildren().add(trash[i]);
        }
        obstacles = new ImageView[3];
        for (int i = 0; i < obstacles.length ; i++) {
            obstacles[i] = new ImageView(obstacle_image);
            obstacles[i].setTranslateX(100);
            obstacles[i].setTranslateY(100);

            setNewElementPosition(obstacles[i]);
            anchorGamePane.getChildren().add(obstacles[i]);
        }
    }
}
