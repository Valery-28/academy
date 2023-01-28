package HomeWokr6.Task3;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        users.add(new User("User", "1", 5));
        users.add(new User("User", "2", 6));
        users.add(new User("User", "3", 9));
        users.add(new User("User", "3", 9));
        users.add(new User("User", "4", 8));
        users.add(new User("User", "5", 5));
        users.add(new User("User", "6", 7));
        users.add(new User("User", "7", 6));
        users.add(new User("User", "8", 4));
        users.add(new User("User", "9", 4));

        File dir = new File("D://прога//academy//HomeWorks//src//HomeWokr6//Task3");

        if (!dir.exists()) {
            dir.mkdir();
        }

        for (User user : users) {
            File outputFile = new File(dir, user.getName() + "_" + user.getSecondName());
            if (!outputFile.exists()) {
                try {
                    outputFile.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            try (ObjectOutputStream oos = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream(outputFile)))) {
                oos.writeObject(user);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        }

    }
}