package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int n = Integer.parseInt(s);
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        if(n>n1 && n>n2 && n1>n2){
            System.out.println(n1);
        } else if(n>n1 && n>n2 && n2>n1){
            System.out.println(n2);
        } else if(n>n1 && n1>n2 && n2>n){
            System.out.println(n);
        }
    }
}
