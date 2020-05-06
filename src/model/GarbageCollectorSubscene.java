package model;

import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.scene.SubScene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.util.Duration;

public class GarbageCollectorSubscene extends SubScene {
    private final static String FONT_PATH = "model/resources/ui/font/kenvector_future.ttf";
    protected final static String PANEL_IMAGE = "model/resources/ui/png/yellow_panel.png";

    private boolean isHidden;

    public GarbageCollectorSubscene(){
        super(new AnchorPane(), 900, 600);
        prefWidth(1000);
        prefHeight(500);

        BackgroundImage backgroundImage = new BackgroundImage(new Image(PANEL_IMAGE, 900, 600, false, true),
                BackgroundRepeat.NO_REPEAT,  BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, null);

        AnchorPane anchorPane = (AnchorPane) this.getRoot();
        anchorPane.setBackground(new Background(backgroundImage));


        isHidden = true;

        setLayoutX(-1024);
        setLayoutY(50);
    }

    public void moveSubScene(){
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(0.5));
        transition.setNode(this);

        if (isHidden){
            transition.setToX(1074);
            transition.setToY(50);
            isHidden = false;
        } else{
            transition.setToX(0);
            transition.setToY(0);
            isHidden = true;
        }

        transition.play();
    }
}
