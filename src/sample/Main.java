//TODO: Fabrizio e Gustavo: Conseguimos modular esse código?


// ------- TODOs do Código -------
//TODO: Antes do dia 06: Movimento de pulo trigado pelo jogador com a tecla eswpaço, plataforma e imagem de fundo repetindo
//TODO: Pontos de score e obstáculos
package sample;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main extends Application {

    //Mounting scene
    public void start(Stage stage) throws IOException {
        //Sprites
        CollectorView collector = new CollectorView();
        collector.collectorToView();

        //set scene
        stage.setScene(new Scene(collector.getCollector(), 1100, 400));
        stage.setResizable(false);

        //scene title
        stage.setTitle("Garbage Collector");

        //show scene
        stage.show();
    }
    public static void main(String[] args){
            Application.launch(args);
            launch(args);
    }
}
