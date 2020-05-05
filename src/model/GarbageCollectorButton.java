package model;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GarbageCollectorButton extends Button {

    private final String FONT_PATH = "src/model/resources/extra/font/kenvector_future.ttf";
    private final String BUTTON_PRESSED_YELLOW = "-fx-background-color: transparent; -fx-background-image: url('/model/resources/extra/png/yellow_button01.png')";
    private final String BUTTON_UNPRESSED_YELLOW = "-fx-background-color: transparent; -fx-background-image: url('/model/resources/extra/png/yellow_button00.png')";

    public GarbageCollectorButton(String text) {
        setText(text);
        setButtonFont();
        setPrefWidth(190);
        setPrefHeight(49);
        setStyle(BUTTON_UNPRESSED_YELLOW);
        initializeButtonListeners();
    }

    private void setButtonFont(){
        try {
            setFont(Font.loadFont(new FileInputStream(FONT_PATH), 23));
        } catch (FileNotFoundException e){
            setFont(Font.font("Verdana", 23));
        }
    }

    private void setButtonPressedStyle(){
        setStyle(BUTTON_PRESSED_YELLOW);
        setPrefHeight(45);
        setLayoutY(getLayoutY() + 4);
    }

    private void setButtonStyle(){
        setStyle(BUTTON_UNPRESSED_YELLOW) ;
        setPrefHeight(49);
        setLayoutY(getLayoutY() - 4);
    }

    private void initializeButtonListeners(){
        setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (mouseEvent.getButton().equals(MouseButton.PRIMARY)){
                    setButtonPressedStyle();
                }
            }
        });

        setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (mouseEvent.getButton().equals(MouseButton.PRIMARY)){
                    setButtonStyle();
                }
            }
        });

        setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                setEffect(new DropShadow());
            }
        });

        setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                setEffect(null);
            }
        });
    }


}
