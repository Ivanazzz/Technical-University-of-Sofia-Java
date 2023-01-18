import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        Scanner sc = new Scanner(System.in);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        while (true) {
            System.out.println("Enter command (or 'exit' to quit):");
            String command = sc.nextLine();

            out.println(command);
            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            String result = in.readLine();
            System.out.format("The server says: %s = %s\n", command, result);
        }

        if (sc != null) {
            sc.close();
        }
        if (in != null) {
            in.close();
        }
        if (out != null) {
            out.close();
        }
    }
}