//TODO: Fabrizio e Gustavo: Conseguimos modular esse código?


// ------- TODOs do Código -------
//TODO: Antes do dia 06: Movimento de pulo trigado pelo jogador com a tecla eswpaço, plataforma e imagem de fundo repetindo
//TODO: Pontos de score e obstáculos
package Application;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import view.ViewManager;

import java.io.IOException;

public class Main extends Application {
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
            primaryStage.setResizable(false);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
            Application.launch(args);
            launch(args);
    }


}
