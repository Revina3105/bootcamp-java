package co.g2academy.io;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //system.in perwakilan dari console untuk mendapatkan input
        String name = " ";
        while (name.equals("stop") == false) {
            System.out.println("Input data here: ");
            name = scanner.nextLine(); //nextLine akan ngeblok
            System.out.println("Data is: " + name);
        }
        scanner.close();
    }
}


        //untuk data tipe integer, diubah dari line 8
        //int data = 1;
        //while (data != -1) {
        //    System.out.println("Input data here: ");
        //    data = scanner.nextLine();
        //    System.out.println("Data is: " + data);

        // int : untuk primitive, integer : untuk objek tapi bisa null hasilnya, dalam praktik sama aja