package object_pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    Connection mySqlConnection;

    DBConnection() {
        try {
            mySqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userservice", "root", "root");
            System.out.println("DbConnection............");
        } catch (SQLException e) {
            System.out.println("Error while creating the connection");
            throw new RuntimeException(e);
        }
    }
}
