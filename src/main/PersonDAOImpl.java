package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonDAOImpl implements PersonDAO{
	private ConnectionProvider connectionProvider;

    public PersonDAOImpl(ConnectionProvider connectionProvider) {
        this.connectionProvider = connectionProvider;
    }
    
	public void insertPerson(Person person) {
        String sqlQuery = "INSERT INTO person (first_name, last_name, birth_date, pesel) VALUES (?, ?, ?, ?)";

        try {
        	Connection connection = connectionProvider.getConnection();
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            statement.setString(1, person.getFirstName());
            statement.setString(2, person.getLastName());
            statement.setString(3, person.getBirthDate());
            statement.setString(4, person.getPesel());
            statement.executeUpdate();
            System.out.println("row inserted");
        } catch (SQLException e) {
            throw new RuntimeException("Failed to insert user into database", e);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
