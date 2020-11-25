package co.g2academy.io;

import java.io.FileInputStream;

public class FileInputStreamExample {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:\\users\\TOSHIBA\\IdeaProjects\\testout.txt");
            int inputChar = 0;
            while ((inputChar = fin.read()) != -1) {
                System.out.print((char) inputChar);
            }
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}