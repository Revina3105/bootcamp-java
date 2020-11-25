package co.g2academy.socket;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(6666);
            while (true) {
                Socket s = server.accept();
                DataInputStream stream = new DataInputStream(s.getInputStream());
                String message = stream.readUTF();
                System.out.println(message);
                if("shutdown".equals(message)) {
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}