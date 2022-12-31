package by.academy.lesson5;

import java.util.Scanner;

public class Exersice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число строк: ");
        int n = sc.nextInt();

        String tempWord = "";               //Временная переменная для слова
        int countChars = 0;                 //Счётчик букв
        int countTempChars = 9999;             //Временный переменная для длины слова
        
        char tempChar = ' ';                    //Временная переменная для буквы


        String[] mas = new String[n];
        for (int i = 0; i < mas.length; i++) {    //Цикл заставляет программу пробежаться по массиву данных
            mas[i] = sc.next();                     //Запись данных массива через сканер
        }


        for (int i = 0; i < mas.length; i++) {                          //Вствроенный массив для преобрахование в
                                                                        // массива string в массив char
            char[] massChar = mas[i].toCharArray();
            for (int j = 0; j < massChar.length; j++) {
                char c = massChar[j];
                if (c != tempChar) {                    //условие для сравнения если с не равно временной переменной,
                                                        //то счётчик добовляет + одну позицию, если равно,
                                                        //то присваивается значение tempChar
                    countChars++;
                }
                tempChar = c;
            }
            if (countChars<countTempChars){             //сравнение счётчика и временного счётчика при верном условии
                                                        // временный счётчик присваивается к счётчику а временое слово

                tempWord = mas[i];                       // к массиву string
                countTempChars = countChars;
            }
            countChars = 0;                     // счётчик присвоение 0
        }

        System.out.println(tempWord);
    }
}