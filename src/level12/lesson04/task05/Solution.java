package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {
        max(4, 20);
        max(400000L, 200000L);
        max(4.0, 20.0);
    }

    //Напишите тут ваши методы
    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else
            return num2;
    }

    public static long max(long num1, long num2) {
        if (num1 > num2) {
            return num1;
        } else
            return num2;
    }

    public static double max(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else
            return num2;
    }
}
