package co.g2academy.socket;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyOtherClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6666);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("Hi its My other client");
            out.flush();
            out.close();
            socket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
