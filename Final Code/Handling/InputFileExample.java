import java.io.FileInputStream;
import java.io.IOException;

public class InputFileExample {
    public static void main(String[] args) {
        // Try-with-resources to ensure the file is properly closed
        try (FileInputStream fis = new FileInputStream("ashish.txt")) {
            int i;
            // Reading file byte by byte
            while ((i = fis.read()) != -1) {
                System.out.print((char) i); // Print each character
            }
        } catch (IOException e) {
            // Handle exceptions if the file is not found or an error occurs
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
