package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int n = Integer.parseInt(s);
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        if(n==n1){
            System.out.println("3");
        } else if(n==n2){
            System.out.println("2");
        } else if(n1==n2){
            System.out.println("1");
        } else
            System.out.println();
    }
}
