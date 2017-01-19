package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] n = new int[20];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            n[i] = Integer.parseInt(s);
        }

        //   int[] n = {1,2,3,4,5,6,7,8,9,10,1000,2,3,4,5,6,7,8,9,10};

        int[] n1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] n2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //      System.out.println(n.length);

        for (int i = 0; i < n.length; i++) {
            if (i <= 9)
                n1[i] = n[i];

            if ((i >= 10) && (i <= 20))
                n2[i - 10] = n[i];
        }
        //Напишите тут ваш код

        //  for(int i = 0;i<n1.length;i++)
        //    {
        //         System.out.println(i+":"+n1[i]);
        //     }

        for (int i = 0; i < n2.length; i++) {
            System.out.println(n2[i]);
        }
    }
}
