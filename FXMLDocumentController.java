package word_game;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Button exit;
     @FXML
     
    private void game(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("game.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Oyun");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.show();
    }
     @FXML
    private void login(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("soru.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Giriş yap");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }
    
}
