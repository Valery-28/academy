package HomeWork2;
/*
Ввести две строки с консоли. Определить, является ли одна строка перестановкой символов другой строки.
Учитываем регистр. Не использовать сортировку.
 */
import java.util.Scanner;
public class Exersice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String str1 = sc.next();
        System.out.print("Введиите вторую строку: ");
        String str2 = sc.next();
        if (str1.length() != str2.length()) {
            System.out.println("Строки не соответствует друг другу по размеру!");
            return;
        }
        boolean result = false;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    result = true;
                    break;
                }
            }
            if (!result) {
                System.out.println("Ответ: " + result);
                return;
            }
            if (i != str1.length()-1){
                result = false;
            }
        }
        System.out.println("Ответ: " + result);
    }

}
