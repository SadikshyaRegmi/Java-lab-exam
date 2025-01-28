package H;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Replace 'testdb' with your database name
        String username = "root"; // Replace with your username
        String password = ""; // Replace with your password

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected successfully!");
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
