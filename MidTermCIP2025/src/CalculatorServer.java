import java.io.*;
import java.net.*;

public class CalculatorServer {
    public static void main(String[] args) {
        int port = 9000;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Calculator Server is running on port " + port);

            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    System.out.println("Client connected: " + clientSocket.getInetAddress());
                    handleClient(clientSocket);
                } catch (IOException e) {
                    System.out.println("Error handling client: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Could not start server: " + e.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                if (inputLine.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected.");
                    break;
                }

                String result = processInput(inputLine);
                out.println(result);
                System.out.println("Processed: " + inputLine + " | Result: " + result);
            }
        } catch (IOException e) {
            System.out.println("Error in communication: " + e.getMessage());
        }
    }

    private static String processInput(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            return "Error: Invalid input format. Use <operation> <number1> <number2>";
        }

        String operation = parts[0];
        double num1, num2;

        try {
            num1 = Double.parseDouble(parts[1]);
            num2 = Double.parseDouble(parts[2]);
        } catch (NumberFormatException e) {
            return "Error: Invalid numbers.";
        }

        switch (operation.toLowerCase()) {
            case "add":
                return String.valueOf(num1 + num2);
            case "subtract":
                return String.valueOf(num1 - num2);
            case "multiply":
                return String.valueOf(num1 * num2);
            case "divide":
                if (num2 == 0) {
                    return "Error: Division by zero.";
                }
                return String.valueOf(num1 / num2);
            default:
                return "Error: Invalid operation. Supported operations: add, subtract, multiply, divide.";
        }
    }
}







