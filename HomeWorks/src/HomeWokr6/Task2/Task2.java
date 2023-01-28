package HomeWokr6.Task2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

    public class Task2 {

        public static void main(String[] args) {
            File dir = new File("D://прога//academy//HomeWorks//src//HomeWokr6//Task2");

            File inputFile = new File(dir, "Text.txt");

            File outputFile = new File(dir, "Result.txt");

            if (!outputFile.exists()) {
                try {
                    outputFile.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            try (FileReader reader = new FileReader(inputFile); FileWriter writer = new FileWriter(outputFile)) {
                int a;
                while ((a = reader.read()) != -1) {
                    if (' ' != (char) a) {
                        writer.write(a);
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

