package homework1;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Видите число от 1-10: ");
        int n = sc.nextInt();
        int sum;
        int k;
            for (k = 0; k <= 10; k++) {
                sum=n*k;
                System.out.println(n +"*" + k + " = "+sum);
            }
        }
    }