package word_game;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class SorularController implements Initializable {

  
   
    @FXML
    private Button close;
    @FXML
    private Button ekleButonu;
    
    @FXML
    private TextField soruEkle;
    @FXML
    private TextField kelimeEkle;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }


    @FXML
    private void close(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void ekleButonu(ActionEvent event) {
        String soru = null;
        String kelime = null;
        soru = soruEkle.getText();
        kelime = kelimeEkle.getText();
        SoruKelime soruKelime = new SoruKelime();
        soruKelime.setSoru(soru);
        soruKelime.setKelime(kelime);
        System.out.println(soru + "     " + kelime);
        FileProcessQuestion fileProcess = new FileProcessQuestion();
        fileProcess.addQuestion(soruKelime);
    }

    @FXML
    private void soruEkle(ActionEvent event) {
       
    }

    @FXML
    private void kelimeEkle(ActionEvent event) {  
        
    }


}
