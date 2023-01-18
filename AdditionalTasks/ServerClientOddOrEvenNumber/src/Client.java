import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        // create socket to connect to server on port 1234
        Socket socket = new Socket("localhost", 1234);
        Scanner sc = new Scanner(System.in);
        // input stream to read data from server
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // output stream to send data to server
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        while (true) {
            System.out.println("Enter a number (or 'exit' to quit): ");
            String input = sc.nextLine();
            out.println(input);
            if (input.equals("exit")) {
                System.out.println("Exiting...");
                break;
            }

            // read result from server
            String result = in.readLine();
            System.out.println("Server says the number is: " + result);
        }

        socket.close();
        sc.close();
        in.close();
        out.close();
    }
}