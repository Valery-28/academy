package HomeWork7.Task1;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    private static final Random rand = new Random();

    public static void main(String[] args) {
        Map<Number, String> map = Stream.generate(() -> rand.nextLong(101)).limit(100).map(i -> Math.PI * i - 20)
                .filter(i -> i < 100).sorted().skip(3)
                .collect(Collectors.toMap(i -> i, i -> "Number:" + String.valueOf(i), (o1, o2) -> o1));

        for (Entry<Number, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

    }
}
