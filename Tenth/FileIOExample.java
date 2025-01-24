package Tenth;


import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        String fileName = "example.txt";
        try {
            // Writing to a file
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a file I/O demonstration.");
            writer.close();
            System.out.println("Data written to file: " + fileName);

            // Reading from a file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}






