import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        try {

            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Сервер запущен на порту 8080. Жду подключения...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Клиент подключился!");

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println("Привет из сервера!");

            clientSocket.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}