//TODO: Fabrizio e Gustavo: Conseguimos modular esse código?


// ------- TODOs do Código -------
//TODO: Antes do dia 06: Movimento de pulo trigado pelo jogador com a tecla eswpaço, plataforma e imagem de fundo repetindo
//TODO: Pontos de score e obstáculos
package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main extends Application {


    //A hashMap which puts a keyCode as true or false
    private HashMap<KeyCode, Boolean> keys = new HashMap<KeyCode, Boolean>();

    private ArrayList<Node> platforms = new ArrayList<>();

    //Loading Images from folder /resources/sprint
    final static javafx.scene.image.Image COLLECTOR_1 = new javafx.scene.image.Image(Main.class.getResource("/resources/sprint/sprint01.png").toString());
    final static javafx.scene.image.Image COLLECTOR_2 = new javafx.scene.image.Image(Main.class.getResource("/resources/sprint/sprint02.png").toString());
    final static javafx.scene.image.Image COLLECTOR_3 = new javafx.scene.image.Image(Main.class.getResource("/resources/sprint/sprint03.png").toString());
    final static javafx.scene.image.Image COLLECTOR_4 = new javafx.scene.image.Image(Main.class.getResource("/resources/sprint/sprint04.png").toString());
    final static javafx.scene.image.Image COLLECTOR_5 = new javafx.scene.image.Image(Main.class.getResource("/resources/sprint/sprint05.png").toString());
    final static javafx.scene.image.Image COLLECTOR_6 = new javafx.scene.image.Image(Main.class.getResource("/resources/sprint/sprint06.png").toString());
    final static javafx.scene.image.Image COLLECTOR_7 = new javafx.scene.image.Image(Main.class.getResource("/resources/sprint/sprint07.png").toString());
    final static javafx.scene.image.Image COLLECTOR_8 = new javafx.scene.image.Image(Main.class.getResource("/resources/sprint/sprint08.png").toString());
    final static javafx.scene.image.Image COLLECTOR_9 = new javafx.scene.image.Image(Main.class.getResource("/resources/sprint/sprint09.png").toString());
    final static javafx.scene.image.Image COLLECTOR_10 = new javafx.scene.image.Image(Main.class.getResource("/resources/sprint/sprint10.png").toString());

    //Jump action
    final static javafx.scene.image.Image COLLECTOR_11 = new javafx.scene.image.Image(Main.class.getResource("/resources/jump/land0003.png").toString());
    final static javafx.scene.image.Image COLLECTOR_12 = new javafx.scene.image.Image(Main.class.getResource("/resources/jump/rising0001.png").toString());
    final static javafx.scene.image.Image COLLECTOR_13 = new javafx.scene.image.Image(Main.class.getResource("/resources/jump/rising0002.png").toString());
    final static javafx.scene.image.Image COLLECTOR_14 = new javafx.scene.image.Image(Main.class.getResource("/resources/jump/rising0003.png").toString());
    final static javafx.scene.image.Image COLLECTOR_15 = new javafx.scene.image.Image(Main.class.getResource("/resources/jump/hoverf0001.png").toString());
    final static javafx.scene.image.Image COLLECTOR_16 = new javafx.scene.image.Image(Main.class.getResource("/resources/jump/hoverf0002.png").toString());
    final static javafx.scene.image.Image COLLECTOR_17 = new javafx.scene.image.Image(Main.class.getResource("/resources/jump/hoverf0003.png").toString());
    final static javafx.scene.image.Image COLLECTOR_18 = new javafx.scene.image.Image(Main.class.getResource("/resources/jump/fallf0001.png").toString());
    final static javafx.scene.image.Image COLLECTOR_19 = new javafx.scene.image.Image(Main.class.getResource("/resources/jump/fallf0002.png").toString());
    final static javafx.scene.image.Image COLLECTOR_20 = new javafx.scene.image.Image(Main.class.getResource("/resources/jump/heavyland0003.png").toString());
    final static javafx.scene.image.Image COLLECTOR_21 = new javafx.scene.image.Image(Main.class.getResource("/resources/jump/heavyland0001.png").toString());
    final static javafx.scene.image.Image COLLECTOR_22 = new javafx.scene.image.Image(Main.class.getResource("/resources/jump/crouch0001.png").toString());

    //Creating group node
    private Group collector;

    private Pane appRoot = new Pane();
    private Pane gameRoot = new Pane();
    private Pane uiRoot = new Pane();

    private Node player;
    private Point2D mapVelocity = new Point2D(0, 0);
    private boolean canJump = true;


    //Mounting scene
    public void start(Stage stage) throws IOException {

        final ImageView collector1 = new ImageView(COLLECTOR_1);
        final ImageView collector2 = new ImageView(COLLECTOR_2);
        final ImageView collector3 = new ImageView(COLLECTOR_3);
        final ImageView collector4 = new ImageView(COLLECTOR_4);
        final ImageView collector5 = new ImageView(COLLECTOR_5);
        final ImageView collector6 = new ImageView(COLLECTOR_6);
        final ImageView collector7 = new ImageView(COLLECTOR_7);
        final ImageView collector8 = new ImageView(COLLECTOR_8);
        final ImageView collector9 = new ImageView(COLLECTOR_9);
        final ImageView collector10 = new ImageView(COLLECTOR_10);
        final ImageView collector11 = new ImageView(COLLECTOR_11);
        final ImageView collector12 = new ImageView(COLLECTOR_12);
        final ImageView collector13 = new ImageView(COLLECTOR_13);
        final ImageView collector14 = new ImageView(COLLECTOR_14);
        final ImageView collector15 = new ImageView(COLLECTOR_15);
        final ImageView collector16 = new ImageView(COLLECTOR_16);
        final ImageView collector17 = new ImageView(COLLECTOR_17);
        final ImageView collector18 = new ImageView(COLLECTOR_18);
        final ImageView collector19 = new ImageView(COLLECTOR_19);
        final ImageView collector20 = new ImageView(COLLECTOR_20);
        final ImageView collector21 = new ImageView(COLLECTOR_21);
        final ImageView collector22 = new ImageView(COLLECTOR_22);


        //Instantiate collector group from imageView Collector
        collector = new Group(collector1);

        //Setting collector translate size
        collector.setTranslateX(192);
        collector.setTranslateY(192);

        //Animate images in loop
        Timeline t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);
        t.setDelay(Duration.millis(300));

        //Images into timeline concept
        t.getKeyFrames().add(
            new KeyFrame(
                Duration.millis(90),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector2);
                }
            )
        );

        t.getKeyFrames().add(
            new KeyFrame(
                Duration.millis(180),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector3);
                }
            )
        );

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(270),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector4);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(360),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector5);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(450),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector6);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(540),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector7);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(630),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector8);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(720),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector9);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(810),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector10);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(900),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector11);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(990),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector12);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1080),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector13);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1170),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector14);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1260),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector15);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1350),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector16);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1440),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector17);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1440),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector18);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1440),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector19);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1440),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector20);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1440),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector21);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1520),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector22);
                }
        ));


        t.play();

        //set scene
        stage.setScene(new Scene(collector, 1100, 400));
        stage.fullScreenProperty();

        //scene title
        stage.setTitle("Collector running");


        //show scene
        stage.show();
    }
    public static void main(String[] args){
            Application.launch(args);
            launch(args);
    }
}
