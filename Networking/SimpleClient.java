package Networking;

import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        try {

            Socket socket = new Socket("localhost", 8080);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            System.out.println("Сервер сказал: " + in.readLine());

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}