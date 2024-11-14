package travel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection to the database
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem", "root", "123");

            // Create a statement object
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace(); // Print stack trace for debugging
        }
    }
}