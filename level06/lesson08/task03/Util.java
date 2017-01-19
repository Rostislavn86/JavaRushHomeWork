package com.javarush.test.level06.lesson08.task03;

/* Класс Util
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра
*/

public class Util {
    // public double dist ;
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double x = Math.pow(x2 - x1, 2);
        double y = Math.pow(y2 - y1, 2);

        double dist;

        return dist = Math.sqrt(x + y);
        //Напишите тут ваш код

    }

    public static void main(String args[]) {
        //  getDistance(3,3,6,6);

        System.out.println(getDistance(3, 3, 6, 6));
    }


}
