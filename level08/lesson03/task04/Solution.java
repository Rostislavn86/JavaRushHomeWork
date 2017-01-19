package com.javarush.test.level08.lesson03.task04;

import java.util.HashMap;
import java.util.Map;

/* Вывести на экран список ключей
Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
 Вывести на экран список ключей, каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        //  System.out.println(map.keySet());

        /*
        Итераторы

HashMap имеет встроенные итераторы, такие, что вы можете получить список всех ключей keySet(),
 всех значений values() или же все пары ключ/значение entrySet(). Ниже представлены некоторые варианты для перебора элементов:

// 1.
for (Map.Entry<String, String> entry: hashmap.entrySet())
    System.out.println(entry.getKey() + " = " + entry.getValue());

// 2.
for (String key: hashmap.keySet())
    System.out.println(hashmap.get(key));

// 3.
Iterator<Map.Entry<String, String>> itr = hashmap.entrySet().iterator();
while (itr.hasNext())
    System.out.println(itr.next());


Стоит помнить, что если в ходе работы итератора HashMap был изменен (без использования собственным методов итератора),
 то результат перебора элементов будет непредсказуемым.
         */

        for (Map.Entry<String, String> entry : map.entrySet())
            System.out.println(entry.getKey());


        //add your code here - напишите тут ваш код
    }
}
