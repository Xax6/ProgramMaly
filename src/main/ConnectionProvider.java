package main;

import java.sql.Connection;

public interface ConnectionProvider {
	Connection getConnection();
    void closeConnection(Connection connection);
}
