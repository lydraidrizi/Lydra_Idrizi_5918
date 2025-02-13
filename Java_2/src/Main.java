import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

 class UniqueFileCreator {
    public static void main(String[] args) {

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fileName = "uniquefile_" + timestamp + ".txt";


        File file = new File(fileName);


        if (file.exists()) {
            System.out.println("File already exists: " + file.getAbsolutePath());
            outputFileDetails(file);
        } else {
            try {

                boolean created = file.createNewFile();
                if (created) {
                    System.out.println("File created: " + file.getAbsolutePath());
                    outputFileDetails(file);
                } else {
                    System.out.println("Failed to create the file.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file: " + e.getMessage());
            }
        }
    }

    private static void outputFileDetails(File file) {
        // Output the details of the file
        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Relative Path: " + file.getPath());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Directory: " + file.getParent());
    }
}