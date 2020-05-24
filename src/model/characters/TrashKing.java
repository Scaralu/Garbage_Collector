package model.characters;

public class TrashKing extends Collector {

    private String imageUrlPath= "src/model/resources/character/trash_king/";
    private String staticCharacterImage= "src/model/resources/character/trash_king/g_idle/idle0001.png";


    @Override
    public String getImageUrlPath() {
        return super.getImageUrlPath();
    }

    @Override
    public void setImageUrlPath(String imageUrlPath) {
        super.setImageUrlPath(imageUrlPath);
    }

    public TrashKing(Integer height, Integer width) {
        super(height, width);
    }

}
