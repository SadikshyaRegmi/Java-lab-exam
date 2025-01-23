package Nine;

import java.io.*;

public class BufferedIO {
    public static void main(String[] args) {
        String fileName = "buffered_example.txt";
        try {
            // Writing data using BufferedWriter
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("This is a demonstration of Buffered I/O in Java.");
            writer.newLine();
            writer.write("BufferedWriter is efficient for writing large text.");
            writer.close();
            System.out.println("Data written to file: " + fileName);

            // Reading data using BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("Content of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

