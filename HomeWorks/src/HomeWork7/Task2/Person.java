package HomeWork7.Task2;

import java.time.LocalDate;

public class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected LocalDate dateOfBirth;
    public Person() {
        super();
    }

    public Person(String firstName, String lastName, int age, LocalDate dateOfBirth) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", dateOfBirth="
                + dateOfBirth + "]";
    }

}