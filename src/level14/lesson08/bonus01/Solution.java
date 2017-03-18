package com.javarush.test.level14.lesson08.bonus01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   // it's first exception
        try {
            float i = 1/0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        // second
        try {
            int[] mas = new int[1];
            for (int i = 0; i <= mas.length; i++) {
                System.out.print(mas[i]);
            }
        } catch (Exception e) {
            exceptions.add(e);
        }

        // third
        try {
            List<Integer> mas = new ArrayList<>();
            for (int i = 0; i <= mas.size(); i++) {
                System.out.print(mas.get(i));
            }
        } catch (Exception e) {
            exceptions.add(e);
        }

        // forth
        try {
            String str = null;
            str.equals("a");
        } catch (Exception e) {
            exceptions.add(e);
        }

        // fifth
        try {
            FileInputStream file = new FileInputStream("data.txt");
        } catch (Exception e) {
            exceptions.add(e);
        }

        // sixth
        try {
            Object i = Integer.valueOf(42);
            String s = (String) i;
        } catch (Exception e) {
            exceptions.add(e);
        }

        // seventh
        try {
            Object szStr[] = new String[10];
            szStr[0] = new Character('*');
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        // eighth
        try {
            URL url = new URL(":\\my.ru");
        } catch (Exception e) {
            exceptions.add(e);
        }

        // ninth
        try {
            int[] mas = new int[-1];
        } catch (Exception e) {
            exceptions.add(e);
        }

        // tenth
        try {
            throw new IllegalStateException();
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
