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

public class InfoLabel extends Label {

    public final static String FONT_PATH = "src/model/resources/ui/font/kenvector_future.ttf";
    public final static String BACKGROUND_IMAG = "model/resources/ui/png/yellow_button13.png";

    public InfoLabel(String text){
        setPrefHeight(150);
        setPrefWidth(1000);
        setPadding(new Insets(40,40,40,40));
        setText(text);
        setWrapText(true);
        setLabelFont();
    }

    private void setLabelFont() {
        try {
            setFont(Font.loadFont(new FileInputStream(new File (FONT_PATH)), 23));
        } catch (FileNotFoundException e){
            e.printStackTrace();
            setFont(Font.font("Verdana", 23));
        }
    }
}
