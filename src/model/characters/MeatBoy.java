package model.characters;

public class MeatBoy extends Collector {

    private String imageUrlPath= "src/model/resources/character/meat_boy/";
    private String staticCharacterImage= "src/model/resources/character/meat_boy/g_idle/idle0001.png";

    public String getStaticCharacterImage() {
        return staticCharacterImage;
    }

    public void setStaticCharacterImage(String staticCharacterImage) {
        this.staticCharacterImage = staticCharacterImage;
    }

    @Override
    public String getImageUrlPath() {
        return super.getImageUrlPath();
    }

    @Override
    public void setImageUrlPath(String imageUrlPath) {
        super.setImageUrlPath(imageUrlPath);
    }

    public MeatBoy(Integer height, Integer width) {
        super(height, width);
    }
}
