package model.characters;

import Application.Main;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class TrashKing extends Collector {

    private String imageUrlPath= "model/resources/character/trash_king/";
    private String staticCharacterImage= "model/resources/character/trash_king/g_idle/idle0001.png";
    private String sprintSpriteSheet = "model/resources/character/trash_king/g_sprint/spriteSheetRunning.png";
    private String jumpSpriteSheet = "model/resources/character/trash_king/g_jump/jumpSpriteSheet.png";

    @Override
    public String getJumpSpriteSheet() {
        return jumpSpriteSheet;
    }

    @Override
    public String getSprintSpriteSheet() {
        return sprintSpriteSheet;
    }

    @Override
    public String getStaticCharacterImage() {
        return staticCharacterImage;
    }

    @Override
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

    public TrashKing(Integer height, Integer width) {
        super(height, width);
    }
}
