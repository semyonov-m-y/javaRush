package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sName = reader.readLine();

        SimpleDateFormat sf = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
        SimpleDateFormat sf1 = new SimpleDateFormat("MM/dd/yyyy");

        Date date = sf1.parse(sName);
        System.out.println(sf.format(date).toUpperCase());
    }
}
