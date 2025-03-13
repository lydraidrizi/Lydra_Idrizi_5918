import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FileReaderTask extends Thread {
    private final String fileName;

    public FileReaderTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Error: " + fileName + " not found");
            return;
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(fileName + ": " + line);
            }
        } catch (IOException e) {
            System.out.println("Error: Cannot read from " + fileName);
        }
    }
}