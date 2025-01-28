package H;

import java.sql.*;

public class JDBCInsertDemo {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO table_name (column1, column2) VALUES ('value1', 'value2')");
            System.out.println("Data inserted successfully!");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static class ConnectToDatabase {
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
}
