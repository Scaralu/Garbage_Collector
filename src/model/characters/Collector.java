package model.characters;

public abstract class Collector {

    private Integer height;
    private Integer width;
    private String imageUrlPath;
    private String staticCharacterImage;

    public String getStaticCharacterImage() {
        return staticCharacterImage;
    }

    public void setStaticCharacterImage(String staticCharacterImage) {
        this.staticCharacterImage = staticCharacterImage;
    }

    public String getImageUrlPath() {
        return imageUrlPath;
    }

    public void setImageUrlPath(String imageUrlPath) {
        this.imageUrlPath = imageUrlPath;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Collector() {
    }

    public Collector(Integer height, Integer width) {
        this.height = height;
        this.width = width;
    }

}
