package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        String[] s2 = new String[s.length()];

        /*
        String s = "12 34 56";
        String[] mass = s.split(" ");
        System.out.println(mass[0]); // выведет 12
        System.out.println(mass[1]); // выведет 34
        System.out.println(mass[2]); // выведет 56

        */


        for (int i = 0; i < 40; i++) {

            System.out.println(s.substring(i, s.length()));


        }


        //напишите тут ваш код
    }

}
