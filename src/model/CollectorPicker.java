package model;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import model.characters.Collector;


public class CollectorPicker extends VBox {

    private boolean isCircleChoosen;

    private ImageView circleImage;
    private ImageView collectorImage;

    private String circleNotChoosen = "model/resources/ui/png/grey_circle.png";
    private String circleChoosen = "model/resources/ui/png/yellow_boxTick.png";

    private Collector collector;

    public CollectorPicker(Collector collector){
        this.collector = collector;
        circleImage = new ImageView(circleNotChoosen);
        collectorImage = new ImageView(collector.getStaticCharacterImage());
        isCircleChoosen = false;
        this.setAlignment(Pos.CENTER);
        this.setSpacing(5);
        this.getChildren().add(circleImage);
        this.getChildren().add(collectorImage);
    }

    public Collector getCollector() {
        return collector;
    }

    public void setCollector(Collector collector) {
        this.collector = collector;
    }

    public boolean getisCircleChoosen() {
        return isCircleChoosen;
    }

    public void setCircleChoosen(boolean isCircleChoosen) {
        this.isCircleChoosen = isCircleChoosen;
        String imageToSet = this.isCircleChoosen ? circleChoosen : circleNotChoosen;
        circleImage.setImage(new Image(imageToSet));
//        getCollector().idleEvent(700, 400, isCircleChoosen);
    }
}
