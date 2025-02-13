import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


 class LineCounter {
    public static void main(String[] args) {
        String fileName = "Java_2";
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }

        System.out.println("Number of lines in the file: " + lineCount);
    }
}