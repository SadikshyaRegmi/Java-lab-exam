package Tenth;


import java.sql.*;

public class FetchData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Update with your database URL
        String username = "root"; // Replace with your DB username
        String password = ""; // Replace with your DB password

        try {
            // Establishing connection to the database
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            // Query to fetch data from a table
            String query = "SELECT * FROM Students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Fetching data from the Students table:");
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("Name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}


