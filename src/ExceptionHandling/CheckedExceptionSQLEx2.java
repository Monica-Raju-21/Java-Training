package ExceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionSQLEx2 {
    public static void main(String[] args) {
        // We try to connect to a fake database URL
        String url = "jdbc:mysql://localhost:3306/wrong_db";

        try {
            System.out.println("Attempting to connect...");

            // This line triggers the CHECKED exception
            Connection conn = DriverManager.getConnection(url, "root", "password");

            // This line only runs if the connection succeeds
            System.out.println("Connected!");

        } catch (SQLException e) {
            // This catches the error so your program handles it gracefully
            System.out.println(">>> Caught a Checked SQLException! <<<");
            System.out.println("Error Message: " + e.getMessage());


            e.printStackTrace();
        }
    }
}
