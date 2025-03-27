import java.io.*;
import java.net.*;
import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 9000;

        try (Socket socket = new Socket(hostname, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to Calculator Server. Type 'exit' to quit.");

            while (true) {
                System.out.print("Enter operation (add, subtract, multiply, divide) and two numbers: ");
                String userInput = scanner.nextLine();

                if (userInput.equalsIgnoreCase("exit")) {
                    out.println("exit");
                    break;
                }

                out.println(userInput);
                String response = in.readLine();
                System.out.println("Server response: " + response);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}