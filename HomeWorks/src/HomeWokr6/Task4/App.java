package HomeWokr6.Task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class App {
    private static final Random rand = new Random();

    public static void main(String[] args) {
        File dir = new File("D://прога//academy//HomeWorks//src//HomeWokr6//Task4//SubStrings");

        if (!dir.exists()) {
            dir.mkdir();
        }
        File inputFile = new File("D://прога//academy//HomeWorks//src//HomeWokr6//Task2//Text.txt");

        StringBuffer text = new StringBuffer();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        int size = text.length();

        File outputFileResult = new File("D://прога//academy//HomeWorks//src//HomeWokr6//Task4//Result.txt");

        if (!outputFileResult.exists()) {
            try {
                outputFileResult.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        try (FileWriter resultWriter = new FileWriter(outputFileResult)) {
            for (int i = 1; i <= 100; i++) {
                File outputFile = new File(dir, Integer.valueOf(i) + ".txt");

                if (!outputFile.exists()) {
                    try {
                        outputFile.createNewFile();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

                int length = rand.nextInt(size);

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                    writer.write(text.substring(0, length));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                resultWriter.write(outputFile.getName() + ", size: " + length + "\n");
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
