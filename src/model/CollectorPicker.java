package model;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;



public class CollectorPicker extends VBox {

    private ImageView circleImage;
    private ImageView collectorImage;

    private String circleNotChoosen = "model/resources/ui/png/grey_circle.png";
    private String circleChoosen = "model/resources/ui/png/yellow_boxTick.png";

    private Collector collector;
    private boolean isCircleChoosen;

    public CollectorPicker(Collector collector){
        setCollector(collector);
        circleImage = new ImageView(circleNotChoosen);
        collectorImage = new ImageView(collector.getUrlCollector());

        isCircleChoosen = false;

        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.getChildren().add(circleImage);
        this.getChildren().add(collectorImage);
    }

    public void setCollector(Collector collector) {
        this.collector = collector;
    }

    public Collector getCollector() {
        return collector;
    }

    public boolean isCircleChoosen() {
        return isCircleChoosen;
    }

    public void setCircleChoosen(boolean isCircleChoosen) {
        this.isCircleChoosen = isCircleChoosen;
        String imageToSet = this.isCircleChoosen ? circleChoosen : circleNotChoosen;
        circleImage.setImage(new Image(imageToSet));
    }
}
