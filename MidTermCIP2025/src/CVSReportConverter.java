
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVReportConverter {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Usage: java CSVReportConverter <input_csv_file> <output_report_file>");
            System.exit(1);
        }

        String inputFilePath = args[0];
        String outputFilePath = args[1];


        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             FileWriter writer = new FileWriter(outputFilePath)) {

            String line;
            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");
                if (parts.length != 2) {
                    System.err.println("Skipping invalid line: " + line);
                    continue; // Skip invalid lines
                }

                String name = parts[0].trim();
                String age = parts[1].trim();


                writer.write(String.format("Name: %s, Age: %s%n", name, age));
            }

            System.out.println("Report has been generated successfully.");

        } catch (IOException e) {

            System.err.println("Error: " + e.getMessage());
        }
    }
}
















