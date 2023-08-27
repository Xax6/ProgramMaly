package main;

public class PersonDataMapper implements DataMapper<Person> {
    public Person mapData(String line) {
        String[] data = line.split("\\|");
        if (data.length == 4) {
            String firstName = data[0];
            String lastName = data[1];
            String birthDate = data[2];
            String pesel = data[3];
            return new Person(firstName, lastName, birthDate, pesel);
        } else {
            throw new IllegalArgumentException("Invalid line format: " + line);
        }
    }
}
