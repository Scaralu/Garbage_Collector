//TODO: Fabrizio e Gustavo: Conseguimos modular esse código?


// ------- TODOs do Código -------
//TODO: Antes do dia 06: Movimento de pulo trigado pelo jogador com a tecla eswpaço, plataforma e imagem de fundo repetindo
//TODO: Pontos de score e obstáculos
package Application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import view.CollectorView;
import view.ViewManager;

import java.io.IOException;

public class Main extends Application {

    //Mounting scene
    public void start(Stage stage) throws IOException {
        try {
            ViewManager manager = new ViewManager();
            Stage primaryStage = manager.getStage();
            primaryStage.show();

//          Event handler for Close action
            primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent windowEvent) {
                    Platform.exit();
                    System.exit(0);
                }
            });

        } catch (Exception e){
            e.printStackTrace();
        }
    }
//        Create movement from sprites
//        CollectorView collector = new CollectorView();
//        collector.collectorToView();

//        set scene
//        stage.setScene(new Scene(collector.getCollector(), 1100, 400));
//        stage.setResizable(false);

//        scene title
//        stage.setTitle("Garbage Collector");

//        show scene
//        stage.show();

    public static void main(String[] args){
            Application.launch(args);
            launch(args);
    }


}
