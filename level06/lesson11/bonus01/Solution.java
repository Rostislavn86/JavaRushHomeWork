package com.javarush.test.level06.lesson11.bonus01;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде «Max is 25»
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        String max2 = "Max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        //max = a > b ? a : b;

        int max1 = a > b ? a : b;

        System.out.println(max2 + max1);
    }

}
