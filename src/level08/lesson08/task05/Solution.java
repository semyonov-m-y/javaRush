package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {

    public static HashMap<String, String> createMap() {
        HashMap<String, String> peoples = new HashMap<>();

        peoples.put("Chervoniy", "Vyacheslav");
        peoples.put("Goncharuk", "Vyacheslav");
        peoples.put("Semyonov", "Maxim");
        peoples.put("Beketova", "Darya");
        peoples.put("Ovchinnikov", "Sergey");
        peoples.put("Fomin", "Evgeniy");
        peoples.put("Zenkin", "Aleksey");
        peoples.put("Tripel", "Aleksey");
        peoples.put("Chuprunov", "Alexandr");
        peoples.put("Stepanov", "Alexandr");

        return peoples;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> duplicates = new HashMap<String, String>();

        /*for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            if (duplicates.containsValue(value)){
                duplicates.remove(key, value);
                map.remove(key, value);
            } else duplicates.put(key, value);
        }*/
        Iterator<Map.Entry<String, String>> iterator3 = duplicates.entrySet().iterator();

        while (iterator3.hasNext()) {
            Map.Entry<String, String> pair1 = iterator3.next();
            String key1 = pair1.getKey();
            String value1 = pair1.getValue();
            if (duplicates.containsValue(value1)){
                //duplicates.remove(key1, value1);
                map.remove(key1, value1);
            } else duplicates.put(key1, value1);
        }
        Iterator<Map.Entry<String, String>> iterator = duplicates.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair1 = iterator.next();
            String key1 = pair1.getKey();
            String value1 = pair1.getValue();
            System.out.println(key1 + ":" + value1);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }

		/*Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, String> pair = iterator.next();
			String key = pair.getKey();
			String value1 = pair.getValue();
			System.out.println(key + ":" + value1);
		}*/
    }

    public static void main(String[] args) {
        removeItemFromMapByValue(createMap(), "Vyacheslav");
        System.out.println("");
        removeTheFirstNameDuplicates(createMap());
    }
}
