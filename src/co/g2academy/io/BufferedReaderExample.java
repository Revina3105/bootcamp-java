package co.g2academy.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException { //penggunaan ini berbahaya, lebih baik menggunakan try catch
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Please enter yourname");

        String name = "";
        //iterasi
        while(!name.equals("stop")) { //selama var name tidak sama dengan stop maka lanjutin terus datanya
            System.out.println("Enter your data: ");
            name = bufferedReader.readLine(); //menggunakan method readLine untuk input per kalimat
            System.out.println("Data is: " + name);
        }
        bufferedReader.close();
        inputStreamReader.close();

    }
}
