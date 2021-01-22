/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word_game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SoruController implements Initializable {

    ArrayList<String> _sorular = new ArrayList<String>();
    @FXML
    private AnchorPane girisEkran;
    @FXML
    private Button soruEkle;
    @FXML
    private PasswordField sifre;
    @FXML
    private TextField name;
    @FXML
    private AnchorPane ekran;

    @FXML
    private void soruEkle (ActionEvent event) throws IOException {
        String kullaniciAd = "Gizem";
        String password = "1234";
        if(name.getText().equals(kullaniciAd) && this.sifre.getText().equals(password))
        {
            Stage stage = new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Sorular.fxml"));
            stage.setScene(new Scene(root));
            stage.setTitle("Giriş yap");
            stage.initModality(Modality.WINDOW_MODAL);
            stage.show();
           
        }
        else
        {
            System.out.println("Hatali giris");
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void dosya(MouseEvent event) {
    }

    @FXML
    private void baslik(MouseEvent event) {
    }

    @FXML
    private void kullaniciResim(MouseEvent event) {
    }

    @FXML
    private void kullanici(MouseEvent event) {
    }

    @FXML
    private void key(MouseEvent event) {
    }

    @FXML
    private void sifre(ActionEvent event) {
    }

    @FXML
    private void name(ActionEvent event) {
    }

    
    
    
    
}
