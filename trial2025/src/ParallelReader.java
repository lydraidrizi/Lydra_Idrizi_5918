import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ParallelReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.print("Enter command: ");
            command = scanner.nextLine().trim();

            if (command.startsWith("read ")) {
                String[] parts = command.split(" ");
                if (parts.length != 3) {
                    System.out.println("Error: Invalid input. Usage: read <file1> <file2>");
                    continue;
                }
                String file1 = parts[1];
                String file2 = parts[2];
                readFiles(file1, file2);
            } else if (command.equals("exit")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Unknown command. Please use read <file1> <file2> or exit.");
            }
        }

        scanner.close();
    }

    private static void readFiles(String file1, String file2) {
        FileReaderTask task1 = new FileReaderTask(file1);
        FileReaderTask task2 = new FileReaderTask(file2);

        task1.start();
        task2.start();

        try {
            task1.join();
            task2.join();
        } catch (InterruptedException e) {
            System.out.println("Error: Thread interrupted");
        }

        System.out.println("Reading complete");
    }
}

