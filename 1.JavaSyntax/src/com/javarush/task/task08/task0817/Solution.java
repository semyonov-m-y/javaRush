package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Pupkin", "Ivan");
        map.put("Pupkin1", "Ivan");
        map.put("Pupkin2", "Denis");
        map.put("Pupkin3", "Pasha");
        map.put("Pupkin4", "Max");
        map.put("Pupkin5", "Alex");
        map.put("Pupkin6", "Ruslan");
        map.put("Pupkin7", "Sergey");
        map.put("Pupkin8", "Gena");
        map.put("Pupkin9", "Anton");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> duplicates = new HashMap<String, String>();
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            if (duplicates.containsValue(value)){
                //removeItemFromMapByValue(copy, value);
            } else duplicates.put(key, value);
        }
        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair1 = iterator.next();
            String key1 = pair1.getKey();
            String value1 = pair1.getValue();
            if (duplicates.containsValue(value1)){
                iterator.remove();
            } else removeItemFromMapByValue(copy, value1);
            iterator.remove();
        }

        Iterator<Map.Entry<String, String>> iterator3 = copy.entrySet().iterator();

        while (iterator3.hasNext()) {
            Map.Entry<String, String> pair3 = iterator3.next();
            String key3 = pair3.getKey();
            String value3 = pair3.getValue();
            System.out.println(key3 + ":" + value3);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        removeItemFromMapByValue(map, "Denis");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            System.out.println(key + ":" + value);
        }

    }
}
