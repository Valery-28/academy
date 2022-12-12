package HomeWork2;
/*
Дан массив с int переменными, определить количество пар, разность которых эквивалентна заданному с консоли target значению.
Например, дан массив чисел [1,2,3,4] и введенное с консоли target
значение 1, у нас есть три пары, которые подходят под заданное условие: 2-1=1, 3-2=1, 4-3=1.
Нужно дописать код в pairs функции, которая принимает массив int значений и target int переменную, которая бы возвращала
 количество пар с заданной разностью.
 */
import java.io.IOException;
import java.util.Scanner;
public class Solution {
        static int pairs(int k, int[] arr) {
            int pairsCount = 0;
            for (int value : arr) {
                for (int i : arr) {
                    if (value - i == k && value != i) {
                        pairsCount++;
                    }
                }
            }
            return pairsCount;
        }
        private static final Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) throws IOException {
            System.out.print("Введи размер массива и Target значение через пробел: ");
            String[] nk = scanner.nextLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            int[] arr = new int[n];
            System.out.print("Введи " + n + " значений для заполнения массива через пробел: ");
            String[] arrItems = scanner.nextLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(arrItems[i]);
                System.out.println(arr[i]);
            }
            int result = pairs(k, arr);
            System.out.println(result);
            scanner.close();
        }
    }