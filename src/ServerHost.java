import java.net.*;
import java.io.*;

public class ServerHost {

    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket(4325);
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


            String inputString = dataInputStream.readUTF();
            System.out.println("message: " + inputString);
            serverSocket.close();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
