import java.io.FileWriter;
import java.io.IOException;

public class Hello {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: java Hello <output_file>");
            System.exit(1);
        }
        String fName = args[0];
        String message = "Hello Distributed Systems World!";
        try (FileWriter fw  = new FileWriter(fName)) {
            fw.write(message);
            System.out.println("Message written to " + fName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
