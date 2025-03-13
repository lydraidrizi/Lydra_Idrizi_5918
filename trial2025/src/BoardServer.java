import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardServer {
    private static final int PORT = 8080;
    private static final Map<String, List<String>> messages = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Server started on port " + PORT);
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                try {
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());
                    handleClient(clientSocket);
                } catch (IOException e) {
                    System.out.println("Error handling client: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error starting server: " + e.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                String[] commandParts = inputLine.split(" ", 3);
                String command = commandParts[0];

                switch (command) {
                    case "post":
                        if (commandParts.length < 3) {
                            out.println("Error: Invalid command");
                        } else {
                            String hashtag = commandParts[1];
                            String message = commandParts[2];
                            postMessage(hashtag, message);
                            out.println("Message posted");
                        }
                        break;
                    case "read":
                        if (commandParts.length < 2) {
                            out.println("Error: Invalid command");
                        } else {
                            String hashtag = commandParts[1];
                            readMessages(out, hashtag);
                        }
                        break;
                    case "bye":
                        System.out.println("Client disconnected");
                        return;
                    default:
                        out.println("Error: Invalid command");
                }
            }
        } catch (IOException e) {
            System.out.println("Error with client connection: " + e.getMessage());
        }
    }

    private static void postMessage(String hashtag, String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String formattedMessage = String.format("[%s] %s", timestamp, message);
        messages.computeIfAbsent(hashtag, k -> new ArrayList<>()).add(formattedMessage);
    }

    private static void readMessages(PrintWriter out, String hashtag) {
        List<String> messageList = messages.get(hashtag);
        if (messageList == null || messageList.isEmpty()) {
            out.println("No messages found");
        } else {
            for (String msg : messageList) {
                out.println(msg);
            }
        }
    }
}