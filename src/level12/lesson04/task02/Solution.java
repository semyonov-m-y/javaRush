package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int i = 1;
        Integer j = 2;
        print(i);
        print(j);
    }

    //Напишите тут ваши методы
    public static void print(int i) {
        System.out.println(i);
    }

    public static void print(Integer j) {
        System.out.println(j);
    }
}
