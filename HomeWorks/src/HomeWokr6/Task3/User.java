package HomeWokr6.Task3;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String secondName;
    private int age;

    public User(String name, String secondName, int age) {
        super();
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", secondName=" + secondName + ", age=" + age + "]";
    }

}