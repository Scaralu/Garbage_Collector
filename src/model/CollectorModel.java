package model;

import Application.Main;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class CollectorModel {

    //Sprint action
    final static javafx.scene.image.Image COLLECTOR_1 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_sprint/sprint01.png").toString());
    final static javafx.scene.image.Image COLLECTOR_2 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_sprint/sprint02.png").toString());
    final static javafx.scene.image.Image COLLECTOR_3 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_sprint/sprint03.png").toString());
    final static javafx.scene.image.Image COLLECTOR_4 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_sprint/sprint04.png").toString());
    final static javafx.scene.image.Image COLLECTOR_5 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_sprint/sprint05.png").toString());
    final static javafx.scene.image.Image COLLECTOR_6 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_sprint/sprint06.png").toString());
    final static javafx.scene.image.Image COLLECTOR_7 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_sprint/sprint07.png").toString());
    final static javafx.scene.image.Image COLLECTOR_8 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_sprint/sprint08.png").toString());
    final static javafx.scene.image.Image COLLECTOR_9 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_sprint/sprint09.png").toString());
    final static javafx.scene.image.Image COLLECTOR_10 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_sprint/sprint10.png").toString());

    //Jump action
    final static javafx.scene.image.Image COLLECTOR_11 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_jump/land0003.png").toString());
    final static javafx.scene.image.Image COLLECTOR_12 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_jump/rising0001.png").toString());
    final static javafx.scene.image.Image COLLECTOR_13 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_jump/rising0002.png").toString());
    final static javafx.scene.image.Image COLLECTOR_14 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_jump/rising0003.png").toString());
    final static javafx.scene.image.Image COLLECTOR_15 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_jump/hoverf0001.png").toString());
    final static javafx.scene.image.Image COLLECTOR_16 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_jump/hoverf0002.png").toString());
    final static javafx.scene.image.Image COLLECTOR_17 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_jump/hoverf0003.png").toString());
    final static javafx.scene.image.Image COLLECTOR_18 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_jump/fallf0001.png").toString());
    final static javafx.scene.image.Image COLLECTOR_19 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_jump/fallf0002.png").toString());
    final static javafx.scene.image.Image COLLECTOR_20 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_jump/heavyland0003.png").toString());
    final static javafx.scene.image.Image COLLECTOR_21 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_jump/heavyland0001.png").toString());
    final static javafx.scene.image.Image COLLECTOR_22 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_jump/crouch0001.png").toString());

    //Idle action
    final static javafx.scene.image.Image COLLECTOR_IDLE_01 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_idle/idle0001.png").toString());
    final static javafx.scene.image.Image COLLECTOR_IDLE_02 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_idle/idle0002.png").toString());
    final static javafx.scene.image.Image COLLECTOR_IDLE_03 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_idle/idle0003.png").toString());
    final static javafx.scene.image.Image COLLECTOR_IDLE_04 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_idle/idle0004.png").toString());
    final static javafx.scene.image.Image COLLECTOR_IDLE_05 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_idle/idle0005.png").toString());
    final static javafx.scene.image.Image COLLECTOR_IDLE_06 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_idle/idle0006.png").toString());
    final static javafx.scene.image.Image COLLECTOR_IDLE_07 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_idle/idle0007.png").toString());
    final static javafx.scene.image.Image COLLECTOR_IDLE_08 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_idle/idle0008.png").toString());
    final static javafx.scene.image.Image COLLECTOR_IDLE_09 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_idle/idle0009.png").toString());
    final static javafx.scene.image.Image COLLECTOR_IDLE_10 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/trash_king/g_idle/idle0010.png").toString());

    //Creating group node
    private Group collector;
    private Group collectorIdle;

    public Group getCollector() {
        return collector;
    }

    public void collectorIdleDefault() {
        final ImageView collector_idle_01 = new ImageView(COLLECTOR_IDLE_01);
        final ImageView collector_idle_02 = new ImageView(COLLECTOR_IDLE_02);
        final ImageView collector_idle_03 = new ImageView(COLLECTOR_IDLE_03);
        final ImageView collector_idle_04 = new ImageView(COLLECTOR_IDLE_04);
        final ImageView collector_idle_05 = new ImageView(COLLECTOR_IDLE_05);
        final ImageView collector_idle_06 = new ImageView(COLLECTOR_IDLE_06);
        final ImageView collector_idle_07 = new ImageView(COLLECTOR_IDLE_07);
        final ImageView collector_idle_08 = new ImageView(COLLECTOR_IDLE_08);
        final ImageView collector_idle_09 = new ImageView(COLLECTOR_IDLE_09);
        final ImageView collector_idle_10 = new ImageView(COLLECTOR_IDLE_10);

        collectorIdle = new Group(collector_idle_01);

        collector_idle_01.setTranslateX(100);
        collector_idle_01.setTranslateY(100);

        Timeline t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(90),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_02);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(180),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_03);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(270),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_04);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(360),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_05);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(450),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_06);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(540),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_07);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(630),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_08);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(720),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_09);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(810),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_10);
                }
        ));

        t.play();
    }

    public void collectorToView() {
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

        //Images into timeline concept
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(90),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector2);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(180),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector3);
                }
        ));

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
                Duration.millis(1550),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector18);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1660),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector19);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1770),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector20);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1880),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector21);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1990),
                (ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector22);
                }
        ));


        t.play();
    }




    final static javafx.scene.image.Image BLUE_COLLECTOR_1 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_sprint/sprint01.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_2 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_sprint/sprint02.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_3 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_sprint/sprint03.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_4 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_sprint/sprint04.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_5 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_sprint/sprint05.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_6 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_sprint/sprint06.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_7 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_sprint/sprint07.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_8 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_sprint/sprint08.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_9 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_sprint/sprint09.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_10 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_sprint/sprint10.png").toString());

    //Jump action
    final static javafx.scene.image.Image BLUE_COLLECTOR_11 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_jump/land0003.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_12 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_jump/rising0001.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_13 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_jump/rising0002.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_14 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_jump/rising0003.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_15 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_jump/hoverf0001.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_16 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_jump/hoverf0002.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_17 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_jump/hoverf0003.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_18 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_jump/fallf0001.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_19 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_jump/fallf0002.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_20 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_jump/heavyland0003.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_21 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_jump/heavyland0001.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_22 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_jump/crouch0001.png").toString());

    //Idle action
    final static javafx.scene.image.Image BLUE_COLLECTOR_IDLE_01 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_idle/idle0001.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_IDLE_02 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_idle/idle0002.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_IDLE_03 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_idle/idle0003.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_IDLE_04 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_idle/idle0004.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_IDLE_05 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_idle/idle0005.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_IDLE_06 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_idle/idle0006.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_IDLE_07 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_idle/idle0007.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_IDLE_08 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_idle/idle0008.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_IDLE_09 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_idle/idle0009.png").toString());
    final static javafx.scene.image.Image BLUE_COLLECTOR_IDLE_10 = new javafx.scene.image.Image(Main.class.getResource("/model/resources/character/blue_trash_king/g_idle/idle0010.png").toString());


    public void collectorIdleBlue() {
        final ImageView collector_idle_01 = new ImageView(COLLECTOR_IDLE_01);
        final ImageView collector_idle_02 = new ImageView(COLLECTOR_IDLE_02);
        final ImageView collector_idle_03 = new ImageView(COLLECTOR_IDLE_03);
        final ImageView collector_idle_04 = new ImageView(COLLECTOR_IDLE_04);
        final ImageView collector_idle_05 = new ImageView(COLLECTOR_IDLE_05);
        final ImageView collector_idle_06 = new ImageView(COLLECTOR_IDLE_06);
        final ImageView collector_idle_07 = new ImageView(COLLECTOR_IDLE_07);
        final ImageView collector_idle_08 = new ImageView(COLLECTOR_IDLE_08);
        final ImageView collector_idle_09 = new ImageView(COLLECTOR_IDLE_09);
        final ImageView collector_idle_10 = new ImageView(COLLECTOR_IDLE_10);

        collectorIdle = new Group(collector_idle_01);

        collector_idle_01.setTranslateX(100);
        collector_idle_01.setTranslateY(100);

        Timeline t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(90),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_02);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(180),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_03);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(270),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_04);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(360),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_05);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(450),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_06);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(540),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_07);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(630),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_08);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(720),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_09);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(810),
                (
                        ActionEvent actionEvent) -> {
                    collector.getChildren().setAll(collector_idle_10);
                }
        ));

        t.play();
    }





}
