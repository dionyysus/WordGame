package word_game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileProcessAnswer {
     public final String FİLE_NAME = "cevaplar.txt";
    private File myFile = new File(FİLE_NAME);

    public FileProcessAnswer() {
        
    }
    
    public void addAnswer(SoruKelime soru) {

        FileWriter fileWriter;
        try {
            //true sonradan eklemek için var
            fileWriter = new FileWriter(FİLE_NAME,true);
            //gelen sorukelime  objesini metine aktarır.
            fileWriter.write(soru.getKelime() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<SoruKelime> getAllAnswer() {
        List<SoruKelime> answers = new ArrayList<>();
        try { 
            Scanner myReader = new Scanner(myFile);
            System.out.println("Scanner islemi basarili");
            while (myReader.hasNextLine()) {
                String answer = myReader.nextLine();  
                SoruKelime soru = new SoruKelime();
                soru.setKelime(answer);               
                answers.add(soru);
            }
            myReader.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        return answers;
    }
    
    private void createFile() {
        try {
            myFile = new File(FİLE_NAME);
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");;
                System.out.println(myFile.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
