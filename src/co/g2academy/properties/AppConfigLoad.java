package co.g2academy.properties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class AppConfigLoad {
    public static void main(String[] args) {
        Properties prop = new Properties();

        try{

            InputStream in =
                    new FileInputStream(
                            "config.properties");
            prop.load(in);

            String server = prop.getProperty("server");
            String port = prop.getProperty("port");
            System.out.println(server);
            System.out.println(port);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
