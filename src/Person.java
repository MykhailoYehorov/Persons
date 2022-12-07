import java.util.Scanner;

public class Person {
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


    public int getAge() {
        return 2022 - this.birthYear;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your First name\n");
        this.firstName = sc.nextLine();

        System.out.println("Write your Last name\n");
        this.lastName = sc.nextLine();

        System.out.println("Write your Birth year\n");
        this.birthYear = sc.nextInt();


    }

    public void output() {
        System.out.println("Person info: \nFirstName: " + firstName + "\n" + "Lastname: " + lastName + "\n" + "Birth Age: "
                + birthYear + "\n" + "Age: " + getAge());
    }

    public void changeName(String firstName, String lastName){
        if (firstName == null)
            this.lastName = lastName;
        else if (lastName == null)
            this.firstName = firstName;
        else {
            this.firstName = firstName;
            this.lastName= lastName;
        }



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