package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        list.add(0, reader.readLine());
        list.add(1, reader.readLine());
        list.add(2, reader.readLine());
        list.add(3, reader.readLine());
        list.add(4, reader.readLine());

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        //Напишите тут ваш код

    }
}
