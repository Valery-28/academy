package HomeWork2;
import java.util.Random;
import java.util.Scanner;
public class Deal {
    public static void main(String[] args) {
        int n;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        String[] koloda = {
                "2pik", "3pik", "4pik", "5pik", "6pik", "7pik", "8pik", "9pik", "10pik", "Vpik", "Dpik", "Kpik", "Tpik",
                "2chr", "3chr", "4chr", "5chr", "6chr", "7chr", "8chr", "9chr", "10chr", "Vchr", "Dchr", "Kchr", "Tchr",
                "2trf", "3trf", "4trf", "5trf", "6trf", "7trf", "8trf", "9trf", "10trf", "Vtrf", "Dtrf", "Ktrf", "Ttrf",
                "2bub", "3bub", "4bub", "5bub", "6bub", "7bub", "8bub", "9bub", "10bub", "Vbub", "Dbub", "Kbub", "Tbub"
        };
        for (int i=0; i<2;i++) {
            System.out.print("Введите число играков: ");
            if (sc.hasNextInt()) {
                temp = sc.nextInt();
                if (1 < temp && temp < 11) {
                    n = temp;
                    mixing(koloda);
                    razdaca(n,koloda);
                    break;
                } else {
                    System.out.println("В покере могут играть от 2 до 10 игроков");
                }
            } else {
                System.out.println("Введите целое число");
                sc.next();
            }
        }
        if (temp >= 11) {
            System.out.println("Не хотите играть, как хотите!");
            return;
    }
        sc.close();
    }
    public static void mixing(String[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int rand = random.nextInt(array.length);
            String temp = array[rand];
            array[rand] = array[i];
            array[i] = temp;
        }
    }
    public static void razdaca(int n, String[] array) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]+" "+array[i + n]+" "+ array[i + n * 2] +" "+array[i + n * 3]+" "+array[i + n * 4]);
        }
    }
}