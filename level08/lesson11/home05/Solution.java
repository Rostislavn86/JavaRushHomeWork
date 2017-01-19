package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        List<String> list = new ArrayList<String>();

        for (String s1 : s.split(" ")) {
            list.add(s1);
        }

        char[] charArray = s.toCharArray(); // стринг аррей в чар
        charArray[0] = Character.toUpperCase(charArray[0]); // символ в ячейке с индексом 0 получает метод


        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == ' ') // если встречаешь пробел, тогда
                charArray[i + 1] = Character.toUpperCase(charArray[i + 1]); // переходи в следующюю ячейку и делай ей апперКейс метод
        }
        System.out.println(charArray);


        //Напишите тут ваш код

    }


}
