package HomeWork5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class Task4 {
    public static void main(String... args) {
//	Задача 4.
//	Создать список оценок учеников с помощью ArrayList, заполнить случайными
//	оценками. Найти самую высокую оценку с использованием итератора.

        ArrayList<Integer> marksList = new ArrayList<>();

        final int N = 10; // количество оценок

        for (int i = 0; i < N; i++) {
            marksList.add((int) (Math.random() * 10));
        }

        System.out.println(marksList);

        int max = marksList.get(0);
        int counter = 0;

        Iterator<Integer> iter = marksList.iterator();
        while (iter.hasNext()) {

            if ((counter = iter.next()) > max) {
                max = counter;
            }
        }
        System.out.println("максимальное число: " + max);

//		Задача 5.
//		Имеется текст. Следует составить для него частотный словарь:
//		Создать Map<Character, Integer> для символов, в который мы заносим символ и его количество.
//		ТОЛЬКО АНГЛИЙСКИЕ БУКВЫ И ЦИФРЫ
        Scanner console = new Scanner(System.in);

        int[] symbols = new int[256];
        System.out.println("Введите текст");
        String text = new String(console.nextLine());
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            symbols[text.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (symbols[i] > 0) {
                map.put((char) i, symbols[i]);
            }
        }

        for (Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
        console.close();

//		Задача 6.
//		Попробовать добавить в массив int на 8 элементов 10 чисел.
//		Обернуть в try/catch, словить ArrayIndexOutOfBoundsException и вывести на экран сообщение:
//		"Array is to small, expand the array".

        int[] array = new int[8];

        try {
            for (int i = 0; i < 11; i++) {
                array[i] = (int) Math.random();
            }

        } catch (ArrayIndexOutOfBoundsException array1) {
            System.out.println("Array is to small, expand the array");
        }
    }
}
