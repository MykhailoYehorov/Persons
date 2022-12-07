public class Person{
//class
private String firstName;
private String lastName;
private int birthYear;


//constructor
    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
//getters
    public String getFirstName(String michael) {
        return firstName;
    }

    public String getLastName(String dunajev) {
        return lastName;
    }

    public int getBirthYear(int i) {
        return birthYear;
    }
    //setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}