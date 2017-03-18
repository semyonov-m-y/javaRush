package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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
            System.out.println("количество отрицательных чисел: 2");
            System.out.println("количество положительных чисел: 1");
        } else if(n1<0 && n2>=0 && n3<0){
            System.out.println("количество отрицательных чисел: 2");
            System.out.println("количество положительных чисел: 1");
        } else if(n1<0 && n2<0 && n3>=0){
            System.out.println("количество отрицательных чисел: 2");
            System.out.println("количество положительных чисел: 1");
        } else if(n1>=0 && n2>=0 && n3<0){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 2");
        } else if(n1>=0 && n2<0 && n3>=0){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 2");
        } else if(n1<0 && n2>=0 && n3>=0){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 2");
        } else if(n1>=0 && n2>=0 && n3>=0){
            System.out.println("количество отрицательных чисел: 0");
            System.out.println("количество положительных чисел: 3");
        } else if(n1<0 && n2<0 && n3<0){
            System.out.println("количество отрицательных чисел: 3");
            System.out.println("количество положительных чисел: 0");
        }

    }
}
