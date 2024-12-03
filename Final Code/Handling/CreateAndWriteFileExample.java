import java.io.FileOutputStream;
import java.io.IOException;

public class CreateAndWriteFileExample {
    public static void main(String[] args) {
        String content = "Hello, Ashish! This is your file content.";
        String fileName = "ashish.txt";

        // Writing content to the file
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(content.getBytes());
            System.out.println("File created and content written successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
