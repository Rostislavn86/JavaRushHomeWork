package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        return str;
    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int ch = Integer.parseInt(reader.readLine());
        return ch;//Напишите тут ваш код

    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double db = Double.parseDouble(reader.readLine());//Напишите тут ваш код
        return db;
    }

    public static void readLn() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (reader.read() != '\n') {
            ;
        }//Напишите тут ваш код

    }
} 