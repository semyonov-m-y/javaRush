package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
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
        int num = Integer.parseInt(s);
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        if(num==num1 && num==num2 && num1==num2){
            System.out.println(num + " " + num1 + " " + num2);
        } else if(num==num1 && num!=num2 && num1!=num2){
            System.out.println(num + " " + num1);
        } else if(num!=num1 && num!=num2 && num1==num2){
            System.out.println(num1 + " " + num2);
        } else if(num1!=num && num1!=num2 && num==num2){
            System.out.println(num + " " + num2);
        } else
            System.out.println("");
    }
}