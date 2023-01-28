package HomeWokr6.Task1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        File file = new File("D://прога//academy//HomeWorks//src//HomeWokr6//Task1//Text.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        try (FileWriter writer = new FileWriter(file); Scanner sc = new Scanner(System.in)) {
            String word;
            while (!"stop".equals(new String(word = sc.next()).toLowerCase())) { // "stop" in any case
                writer.write(word + " ");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
