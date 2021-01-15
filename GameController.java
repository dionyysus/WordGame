package word_game;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import static javafx.beans.binding.Bindings.size;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class GameController implements Initializable {
    @FXML
    private Button harfButon;
    @FXML
    private Button tahminButon;
    private TextField tahminField;
    @FXML
    private HBox kelimePane;
    @FXML
    private Label puanLabel;
    
    
    String not = "";
    FileProcessQuestion fileProcess = new FileProcessQuestion();

    public static List<SoruKelime> soruKelimes = new ArrayList<>();
    SoruKelime sorukelime = new SoruKelime();
                                       

    int size = fileProcess.getAllQuestion().size();
 
    String kelime= null;
    String soru = null;
    public static int toplamPuan = 0;
    @FXML
    private TextField kelimeTahmin;
    @FXML
    private Button tahminButon1;
    int  index = -1;
    @FXML
    private Label soruLabel;

    @FXML
    private TextField adText;

    public static String isim;


    @Override   
    public void initialize(URL url, ResourceBundle rb) {

        System.out.println("initalize çalıştı");
       
        soruKelimes = (ArrayList<SoruKelime>) fileProcess.getAllQuestion();
        ArrayList<String> cekilenSoru = new ArrayList<>();

        sorukelime  = soruKelimes.get(sayiUret());
        kelime = sorukelime.getKelime();
        soru = sorukelime.getSoru();
        System.out.println(soru);
        soruLabel.setText(soru);
        //cekilenSoru.add(soru);



           /*
            harfButon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               
            }
        });*/

        //lambda expression
       harfButon.setOnAction(event -> {
            int  sayiHarf = index;
            index++;

            //System.out.println(sayiHarf);

            if (kelime.length()>=sayiHarf) {
                Label label = new Label();
                label.setTextFill(Color.web("#ffffff"));
                label.setFont(new javafx.scene.text.Font(30));
                kelimePane.setSpacing(5);
                label.setMinWidth(40);
                label.setMaxHeight(40);
                label.setText(String.valueOf(kelime.charAt(sayiHarf)));
                kelimePane.getChildren().add(label);
           }

       });

        tahminButon1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                sorukelime  = soruKelimes.get(sayiUret());
                index = 0;
                kelime = sorukelime.getKelime();
                soru = sorukelime.getSoru();
                kelimePane.getChildren().remove(0, kelimePane.getChildren().size());
                soruLabel.setText(soru);
           }
        });
    }



    @FXML
    private void harfButon(ActionEvent event) {

        System.out.println("TEST");
    }

    @FXML
    private void tahminButon(ActionEvent event) {
        int puan =0;

        int uzunluk = kelimeTahmin.getText().length();
        if(kelimeTahmin.getText().equals( kelime))
        {
            puan+=100*uzunluk-(index*10);
            puanLabel.setText(String.valueOf(puan));
            toplamPuan+=puan;
        }
        else
        {
            puan-=100*uzunluk-(index*100);
            puanLabel.setText(String.valueOf(puan));
            toplamPuan+=puan;
        }

    }

    private  int sayiUret(){

        int sayi = (int) (Math.random() * size);
        return sayi;
    }





    @FXML
    private void bitir(ActionEvent event) throws IOException {
        //System.out.println("toplam puan:"+toplamPuan);
        Stage stage = new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Bitir.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Bitir");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.show();

        isim = adText.getText();
        System.out.println(isim);
    }
    @FXML
    private void adText(ActionEvent event) {
        /*isim = adText.getText();
        System.out.println(isim);*/
    }

    private class stage {
        public stage() {
        }
    }
}
