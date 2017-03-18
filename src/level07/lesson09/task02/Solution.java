package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<5; i++){
            String s = reader.readLine();
            list.add(s);
        }
        list.remove(2);
        for(int j=0; j<list.size(); j++){
            System.out.println(list.get(list.size() - j - 1));
        }

    }
}
