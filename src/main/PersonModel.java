package main;

public interface PersonModel {
	String getFirstName();
    void setFirstName(String firstName);

    String getLastName();
    void setLastName(String lastName);

    String getBirthDate();
    void setBirthDate(String birthDate);

    String getPesel();
    void setPesel(String pesel);
}
