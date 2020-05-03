package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label label;

    @FXML
    private void handleButtonEvent(ActionEvent actionEvent){
        System.out.println("Hello World");
        label.setText("Olá");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
