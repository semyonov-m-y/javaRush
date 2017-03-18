package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pupkin", 100);
        map.put("Pupkin1", 200);
        map.put("Pupkin2", 300);
        map.put("Pupkin3", 400);
        map.put("Pupkin4", 500);
        map.put("Pupkin5", 600);
        map.put("Pupkin6", 700);
        map.put("Pupkin7", 800);
        map.put("Pupkin8", 900);
        map.put("Pupkin9", 1000);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> item = iterator.next();
            int value = item.getValue();
            if (value < 500) {
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);
    }
}