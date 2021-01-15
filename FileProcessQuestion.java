/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word_game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessQuestion {
    
    public final String FİLE_NAME = "sorular.txt";
    private File myFile = new File(FİLE_NAME);

    public FileProcessQuestion() {
        createFile();
        
    }
    public void addQuestion(SoruKelime soru) {

        FileWriter fileWriter;
        try {
            //true sonradan eklemek için var
            fileWriter = new FileWriter(FİLE_NAME,true);
            //gelen sorukelime  objesini metine aktarır.
            fileWriter.write(soru.getSoru() + "&" + soru.getKelime() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<SoruKelime> getAllQuestion() {
        List<SoruKelime> questions = new ArrayList<>();
        try { 
            Scanner myReader = new Scanner(myFile);
            System.out.println("Scanner islemi basarili");
            while (myReader.hasNextLine()) {
                String data;
                data = myReader.nextLine();
                int index = data.indexOf("&");
                String question = data.substring(0, index);
                String answer = data.substring(index+1);
                SoruKelime soru = new SoruKelime();
                soru.setSoru(question);
                soru.setKelime(answer);
                questions.add(soru);

            }
            myReader.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        return questions;
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















    /*
    public void addQuestion(SoruKelime soru) {

        FileWriter fileWriter;
        try {
            //true sonradan eklemek için var
            fileWriter = new FileWriter(FİLE_NAME,true);
            //gelen sorukelime objesini metine aktarır.
            fileWriter.write(soru.getSoru() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<SoruKelime> getAllQuestion() {
        List<SoruKelime> questions = new ArrayList<>();
        try {
            Scanner myReader = new Scanner(myFile);
            System.out.println("Scanner islemi basarili");
            while (myReader.hasNextLine()) {
                String question = myReader.nextLine();
                SoruKelime soru = new SoruKelime();
                soru.setSoru(question);
                questions.add(soru);
            }
            myReader.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        return questions;
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
    }*/

}
