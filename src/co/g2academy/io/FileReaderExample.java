package co.g2academy.io;

import java.io.FileReader;

public class FileReaderExample {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\users\\TOSHIBA\\IdeaProjects\\testout.txt");
            int charRead = 0;
            while ((charRead = reader.read()) != -1) {
                System.out.print((char) charRead);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
