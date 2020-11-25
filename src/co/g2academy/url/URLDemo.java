package co.g2academy.url;

import java.net.URL;
public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.vidio.com:443/categories/29-tv-show");
            System.out.println("Protocol:" + url.getProtocol());
            System.out.println("Host name: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File: " + url.getPath());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
