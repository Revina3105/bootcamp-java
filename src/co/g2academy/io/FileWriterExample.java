package co.g2academy.io;

import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\users\\TOSHIBA\\IdeaProjects\\testout.txt");
            writer.write("This is code to write string");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}