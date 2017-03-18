package com.javarush.test.level08.lesson11.home09;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 4 2020"));
    }

    public static boolean isDateOdd(String date)
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "January");
        map.put(2, "February");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        map.put(6, "June");
        map.put(7, "July");
        map.put(8, "August");
        map.put(9, "September");
        map.put(10, "October");
        map.put(11, "November");
        map.put(12, "December");

        String[] res = date.split(" ");
        Date date1 = new Date();
        date1.setDate(Integer.parseInt(res[1]));
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, String> item = it.next();
            Integer key = item.getKey();
            String value = item.getValue();
            if (res[0].equals(value.toUpperCase())) {
                date1.setMonth(key);
            }
        }

        date1.setYear(Integer.parseInt(res[2]));

        Date date2 = new Date();

        date2.setDate(1);
        date2.setHours(0);
        date2.setMinutes(0);
        date2.setSeconds(0);
        date2.setMonth(0);
        date2.setYear(Integer.parseInt(res[2]));

        long msDelay = date1.getTime() - date2.getTime();
        long dayLong = 24*60*60*1000;
        long daysCount = msDelay/dayLong;
        System.out.println(daysCount - 31);

        if ((daysCount - 30) % 2 == 0) {
            return false;
        }
        return true;
    }
}
