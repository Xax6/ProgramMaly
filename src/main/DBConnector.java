package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector implements ConnectionProvider {
	static String URL = "jdbc:mysql://localhost/Test";
	static String USER = "root";
	static String PWD = "";
    private static Connection connection;
	
    
	public Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PWD);
                System.out.println("Connected to DB");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
	
	public void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                DBConnector.connection = null;
                System.out.println("Connection closed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
