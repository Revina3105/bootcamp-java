package co.g2academy.io;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream(
                    "C:\\users\\TOSHIBA\\IdeaProjects\\testout.txt");
            fout.write(65);
            fout.write("30".getBytes());
            fout.write(" this is my first code to write a file ".getBytes());
            fout.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}