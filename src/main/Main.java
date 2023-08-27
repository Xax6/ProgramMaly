package main;

import java.sql.SQLException;
import java.util.List;

public class Main {
	public static void main(String[] args) throws SQLException {
		
		ReadFile<Person> readFile = new ReadFile<>();
		List<Person> persons = readFile.readFile(new PersonDataMapper());
		
		ConnectionProvider connectionProvider = new DBConnector();
		
		PersonDAOImpl personDAO = new PersonDAOImpl(connectionProvider);
		for (Person person : persons) {
			personDAO.insertPerson(person);
		}
		connectionProvider.closeConnection(connectionProvider.getConnection());
		
	}
}
