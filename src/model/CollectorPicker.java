package model;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import model.characters.Collector;
import model.characters.CollectorModel;


public class CollectorPicker extends VBox {

    private ImageView circleImage;
    private ImageView collectorImage;

    private String circleNotChoosen = "model/resources/ui/png/grey_circle.png";
    private String circleChoosen = "model/resources/ui/png/yellow_boxTick.png";

    private Collector collector;
    private CollectorModel collectorModel;
    private boolean isCircleChoosen;

    public Collector getCollector() {
        return collector;
    }

    public void setCollector(Collector collector) {
        this.collector = collector;
    }

    public CollectorPicker(Collector collector){
        setCollector(collector);
        collectorImage = new ImageView(collector.getStaticCharacterImage());
        isCircleChoosen = false;
        circleImage = new ImageView(circleNotChoosen);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.getChildren().add(circleImage);
        this.getChildren().add(collectorImage);
    }

    public boolean isCircleChoosen() {
        return isCircleChoosen;
    }

    public void setCircleChoosen(boolean isCircleChoosen, Collector collector) {
        this.isCircleChoosen = isCircleChoosen;
        String imageToSet = this.isCircleChoosen ? circleChoosen : circleNotChoosen;
        circleImage.setImage(new Image(imageToSet));
        collectorModel.idleEvent(collector, 192, 192, isCircleChoosen);
        if (isCircleChoosen){
            collectorImage.setImage(null);
        }
    }
}
