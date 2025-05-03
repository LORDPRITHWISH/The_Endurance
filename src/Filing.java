import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

class FileOp {
    static void writeToFile(String path, String content) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }

    static void readFromFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            System.out.println("--------------------");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("--------------------");
            System.out.println("File read successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}

public class Filing {
    public static void main(String[] args) {
//        FileOp.writeToFile("files/test.txt", "The darkness has a way of making a person feel like they are not alone, even when they are surrounded by people.");
//        FileOp.writeToFile("files/darkness.txt", "In the darkness, I can see the light of my own soul.");

        FileOp.readFromFile("files/dark.txt");
        FileOp.readFromFile("files/test.txt");

    }
}

