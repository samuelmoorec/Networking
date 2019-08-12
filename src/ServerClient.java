import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ServerClient {

    public static void main(String[] args) {

        try {
            Socket clientSocket = new Socket("localhost",4325);
            DataOutputStream dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write message now.");
            String UserMessage = scanner.nextLine();
            dataOutputStream.writeUTF(UserMessage);
            dataOutputStream.flush();
            dataOutputStream.close();
            clientSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
