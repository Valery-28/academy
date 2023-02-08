package HomeWork7.Task2;

import java.time.LocalDate;

public class User extends Person {
    private String login;
    private String password;
    private String email;

    public User() {
        super();
    }

    public User(String firstName, String lastName, int age, LocalDate dateOfBirth) {
        super(firstName, lastName, age, dateOfBirth);
    }

    public User(String login, String password, String email, String firstName, String lastName, int age,
                LocalDate dateOfBirth) {
        super(firstName, lastName, age, dateOfBirth);
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printUserInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "User [login=" + login + ", password=" + password + ", email=" + email + ", firstName=" + firstName
                + ", lastName=" + lastName + ", age=" + age + ", dateOfBirth=" + dateOfBirth + "]";
    }

}