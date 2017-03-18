package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {
        min(4, 20);
        min(400000L, 200000L);
        min(4.0, 20.0);
    }

    //Напишите тут ваши методы
    public static int min(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else
            return num2;
    }

    public static long min(long num1, long num2) {
        if (num1 < num2) {
            return num1;
        } else
            return num2;
    }

    public static double min(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else
            return num2;
    }
}
