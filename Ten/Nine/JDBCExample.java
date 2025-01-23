package Nine;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Update with your database URL
        String username = "root"; // Replace with your DB username
        String password = ""; // Replace with your DB password

        try {
            // Connecting to the database
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            // Creating a statement and executing a query
            Statement stmt = conn.createStatement();
            String query = "CREATE TABLE IF NOT EXISTS Students (ID INT PRIMARY KEY, Name VARCHAR(50))";
            stmt.execute(query);
            System.out.println("Table created or already exists!");

            // Inserting data
            query = "INSERT INTO Students (ID, Name) VALUES (1, 'John Doe')";
            stmt.executeUpdate(query);
            System.out.println("Data inserted into the table!");

            // Reading data
            query = "SELECT * FROM Students";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("ID") + ", Name: " + rs.getString("Name"));
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}

