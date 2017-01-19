package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());

            //       array[i] = k++;
            //        System.out.println("!!!!!!!!!" + i );
        }

        sort(array);


    }

    public static void sort(int[] array) {
        int[] array2 = new int[5];

        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array);
            array2[0] = array[19];
            array2[1] = array[18];
            array2[2] = array[17];
            array2[3] = array[16];
            array2[4] = array[15];

        }

        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);
        System.out.println(array2[3]);
        System.out.println(array2[4]);

        //Напишите тут ваш код
    }
}
