package main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryExecutorImpl implements QueryExecutor {

	public void executeQuery(String query) {
        try {
        	ConnectionProvider connectionProvider = new DBConnector();
        	Connection connection = connectionProvider.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            connectionProvider.closeConnection(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
	
}
