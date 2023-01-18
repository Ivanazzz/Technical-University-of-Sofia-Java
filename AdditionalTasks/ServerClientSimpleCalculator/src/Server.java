import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException, Exception {
        ServerSocket serverSocket = new ServerSocket(1234);

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                String command = in.readLine();
                if (command.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected");
                    break;
                }

                String[] commandTokens = command.split("[ ]+");

                try {
                    int firstNumber = Integer.parseInt(commandTokens[0]);
                    String action = commandTokens[1];
                    int secondNumber = Integer.parseInt(commandTokens[2]);

                    String result;
                    switch (action) {
                        case "+":
                            result = String.format("%d", firstNumber + secondNumber);
                            break;
                        case "-":
                            result = String.format("%d", firstNumber - secondNumber);
                            break;
                        case "*":
                            result = String.format("%d", firstNumber * secondNumber);
                            break;
                        case "/":
                            if (secondNumber == 0) {
                                throw new ArithmeticException("Cannot divide by zero!");
                            }

                            result = String.format("%.2f", firstNumber * 1.0 / secondNumber);
                            break;
                        default:
                            throw new Exception("Invalid operation!");
                    }

                    out.println(result);
                } catch (ArithmeticException ae) {
                    out.println(ae.getMessage());
                } catch (Exception e) {
                    out.println(e.getMessage());
                }
            }

            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}