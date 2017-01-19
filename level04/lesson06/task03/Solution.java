package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
//Вводим три числа
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
//методом max ищем самое больше среди a b
        int maxABC = max(a, b, c);
        int minABC = min(a, b, c);
        int middle = middle(a, b, c);

        //  System.out.println(minABC);
        System.out.println(maxABC + " " + middle + " " + minABC);
//этим же методом ищем самое большое
//среди первой пары и c

//аналогичный выбор делаем минимального
//значения с помощью метода min

//если число меньше максимума и больше минимума - печатаем

    }

    private static int min(int a, int b, int c) {
//метод поиска минимального

        if ((b < a) && (b < c)) return b;
        else if ((c < a) && (c < b)) return c;
        else if ((a < b) && (a < c)) return a;
        else
            return a;
    }

    private static int max(int a, int b, int c) { //метод поиска максимального
        if ((a > b) && (a > c)) return a;
        else if ((b > a) && (a > c)) return b;
        else if ((c > a) && (c > b)) return c;
        else return a;
    }

    private static int middle(int a, int b, int c) {
        int max = 0;
        int min = 0;

        if ((b < a) && (b < c)) min = b;
        else if ((c < a) && (c < b)) min = c;
        else if ((a < b) && (a < c)) min = a;
        else min = 0;

        if ((a > b) && (a > c)) max = a;
        else if ((b > a) && (a > c)) max = b;
        else if ((c > a) && (c > b)) max = c;
        else max = 0;

        if (min == a) a = 0;
        if (min == b) b = 0;
        if (min == c) c = 0;

        if (max == a) a = 0;
        if (max == b) b = 0;
        if (max == c) c = 0;

        return (a + b + c);

    }
}
