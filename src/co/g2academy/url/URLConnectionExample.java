package co.g2academy.url;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.vidio.com:443/categories/29-tv-show");
            URLConnection connection = url.openConnection(); //untuk mengambil semua teks dari sebuah website
            InputStream in = connection.getInputStream(); //baca file
            int i;
            while ((i = in.read()) != -1) {
                System.out.print((char) i);
            }
        } catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }