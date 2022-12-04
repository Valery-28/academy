package by.academy.lesson5;

import java.util.Scanner;

public class Exersice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число сток: ");
        int n = sc.nextInt();
        int sred = 0;
        String[] masStrok = new String[n];
        for (int i = 0; i < masStrok.length; i++) {    //Цикл заставляет программу пробежаться по массиву данных
            masStrok[i] = sc.next();                  //Запись данных массива через сканер
            sred += masStrok[i].length();
        }
        sred = sred / masStrok.length;                //Среднее значение элемента строки
        for (int j = 0; j < masStrok.length; j++) {  //Цикл заставляет пробежаться по массиву данных
            if (masStrok[j].length() > sred) {          //Проверка элемент массива больше среднего
                System.out.println(masStrok[j]);
            }
        }
    }
}
