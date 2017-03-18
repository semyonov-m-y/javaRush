package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String s = reader1.readLine();
        return s;
    }

    public static int readInt() throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader2.readLine());
        return i;
    }

    public static double readDouble() throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(reader3.readLine());
        return d;
    }

    public static boolean readBoolean() throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader4.readLine();
        return Boolean.parseBoolean(s1);
    }
}
