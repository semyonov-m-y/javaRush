package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String s3 = reader.readLine();
        int num = Integer.parseInt(s);
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        int num3 = Integer.parseInt(s3);
        int m = nums(num, num1);
        int n = nums(num2, num3);
            if(m>n){
                System.out.println(m);
            } else
                System.out.println(n);

    }

    public static int nums(int a, int b){
        if(a>b)
            return a;
        else
            return b;
    }
}
