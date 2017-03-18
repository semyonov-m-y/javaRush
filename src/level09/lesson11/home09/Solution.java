package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map<String, Cat> map1 = new HashMap<>();
        map1.put("Cat1", new Cat("Cat1"));
        map1.put("Cat2", new Cat("Cat2"));
        map1.put("Cat3", new Cat("Cat3"));
        map1.put("Cat4", new Cat("Cat4"));
        map1.put("Cat5", new Cat("Cat5"));
        map1.put("Cat6", new Cat("Cat6"));
        map1.put("Cat7", new Cat("Cat7"));
        map1.put("Cat8", new Cat("Cat8"));
        map1.put("Cat9", new Cat("Cat9"));
        map1.put("Cat10", new Cat("Cat10"));
        return map1;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> m : map.entrySet()){
            Cat value = m.getValue();
            set.add(value);
        }

        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }
}
