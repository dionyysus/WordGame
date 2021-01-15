/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word_game;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class BitirController implements Initializable {

    @FXML
    private Label puanGoster;
    @FXML
    private Label adGoster;
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        puanGoster.setText(String.valueOf(GameController.toplamPuan));
        adGoster.setText(GameController.isim);
    }    
    
}
