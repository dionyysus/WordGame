package word_game;

import java.awt.Insets;
import static java.awt.SystemColor.window;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Word_Game extends Application {

    //List<SoruKelime> sorular = new ArrayList<>();
    @Override
    public void init() throws Exception {

        super.init();     
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        
    }
    public static void main(String[] args) {
        launch(args);
    }

    
}
