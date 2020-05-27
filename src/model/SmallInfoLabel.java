package model;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.text.Font;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SmallInfoLabel extends Label {
    private final static String FONT_PATH = "src/model/resources/ui/font/kenvector_future.ttf";

    public SmallInfoLabel(String text){
        setPrefHeight(50);
        setPrefWidth(130);

        BackgroundImage backgroundImage = new BackgroundImage(
                new Image("model/resources/ui/png/yellow_button13.png", 130, 50,false,true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, null);
        setBackground(new Background(backgroundImage));
        setAlignment(Pos.CENTER_LEFT);
        setPadding(new Insets(10,10,10,10));
        setLabelFont();
        setText(text);
    }
    public void setLabelFont(){
        try {
            setFont(Font.loadFont(new FileInputStream(new File(FONT_PATH)), 15));
        } catch (FileNotFoundException e){
            e.printStackTrace();
            setFont(Font.font("Verdana", 15));
        }
    }
}
