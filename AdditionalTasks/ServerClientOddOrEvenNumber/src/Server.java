import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        // create server socket on port 1234
        ServerSocket serverSocket = new ServerSocket(1234);

        while (true) {
            // wait for client to connect
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            // input stream to read data from client
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // output stream to send data to client
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                // read data from client
                String input = in.readLine();
                if (input.equals("exit")) {
                    System.out.println("Client disconnected");
                    break;
                }

                // determine if number is odd or even
                int number = Integer.parseInt(input);
                String result = (number % 2 == 0) ? "even" : "odd";

                // send result to client
                out.println(result);
            }

            in.close();
            out.close();
        }
    }
}