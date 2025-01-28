package H;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "";

        String insertQuery = "INSERT INTO users (id, name, email) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            // Set parameters for the query
            preparedStatement.setInt(1, 1);  // ID
            preparedStatement.setString(2, "Alice"); // Name
            preparedStatement.setString(3, "alice@example.com"); // Email

            int rows = preparedStatement.executeUpdate();
            System.out.println(rows + " row(s) inserted successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

