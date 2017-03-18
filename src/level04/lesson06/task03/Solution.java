package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        if(num>num1 && num>num2 && num1>num2){
            System.out.println(num + " " + num1 + " " + num2);
        } else if(num>num1 && num>num2 && num2>num1){
            System.out.println(num + " " + num2 + " " + num1);
        } else if(num1>num && num1>num2 && num>num2){
            System.out.println(num1 + " " + num + " " + num2);
        } else if(num1>num && num1>num2 && num2>num){
            System.out.println(num1 + " " + num2 + " " + num);
        } else if(num2>num1 && num2>num && num1>num){
            System.out.println(num2 + " " + num1 + " " + num);
        } else
            System.out.println(num2 + " " + num + " " + num1);
    }
}
