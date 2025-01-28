package H;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
            System.out.println("Connected to the database!");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
