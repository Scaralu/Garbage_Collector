package model.characters;

import Application.Main;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class BlueTrashKing extends Collector{

    private int height;
    private int width;
    private String imageUrlPath= "model/resources/character/blue_trash_king/";
    private String staticCharacterImage= "model/resources/character/blue_trash_king/g_idle/idle0001.png";
    private String sprintSpriteSheet = "model/resources/character/blue_trash_king/g_sprint/sprintSpriteSheet.png";
    private String jumpSpriteSheet = "model/resources/character/blue_trash_king/g_sprint/jumpSpriteSheet.png";

    @Override
    public String getSprintSpriteSheet() {
        return sprintSpriteSheet;
    }

    @Override
    public String getJumpSpriteSheet() {
        return jumpSpriteSheet;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public String getStaticCharacterImage() {
        return staticCharacterImage;
    }

    public void setStaticCharacterImage(String staticCharacterImage) {
        this.staticCharacterImage = staticCharacterImage;
    }

    @Override
    public String getImageUrlPath() {
        return imageUrlPath;
    }

    @Override
    public void setImageUrlPath(String imageUrlPath) {
        this.imageUrlPath = imageUrlPath;
    }

    public BlueTrashKing(Integer height, Integer width) {
        super(height, width);
    }
}
