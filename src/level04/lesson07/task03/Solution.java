package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = Integer.parseInt(s3);

        if(n1>=0 && n2<0 && n3<0){
            System.out.println("1");
        } else if(n1<0 && n2>=0 && n3<0){
            System.out.println("1");
        } else if(n1<0 && n2<0 && n3>=0){
            System.out.println("1");
        } else if(n1>=0 && n2>=0 && n3<0){
            System.out.println("2");
        } else if(n1>=0 && n2<0 && n3>=0){
            System.out.println("2");
        } else if(n1<0 && n2>=0 && n3>=0){
            System.out.println("2");
        } else if(n1>=0 && n2>=0 && n3>=0){
            System.out.println("3");
        } else if(n1<0 && n2<0 && n3<0){
            System.out.println("0");
        }
    }
}
