package main;

public class Person implements PersonModel {
	private String firstName;
	private String lastName;
	private String birthDate;
	private String pesel;
	
	
	public Person(String firstName, String lastName, String birthDate, String pesel) {
		setFirstName(firstName);
        setLastName(lastName);
        setBirthDate(birthDate);
        setPesel(pesel);
	}
	
	
	public void setFirstName(String firstName) {
        if (firstName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty.");
        }
        this.firstName = firstName;
    }
	
	public void setLastName(String lastName) {
        if (lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be empty.");
        }
        this.lastName = lastName;
    }

    public void setBirthDate(String birthDate) {
        if (birthDate.isEmpty() || !DateFormatValidator.isValid(birthDate)) {
            throw new IllegalArgumentException("Wrong date format.");
        }
        this.birthDate = birthDate;
    }

    public void setPesel(String pesel) {
        if (pesel.isEmpty() || pesel.length() != 11) {
            throw new IllegalArgumentException("Wrong PESEL.");
        }
        try {
            Long.parseLong(pesel);
            this.pesel = pesel;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Wrong PESEL.");
        }
    }
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getBirthDate() {
		return birthDate;
	}
	
	public String getPesel() {
		return pesel;
	}
}
