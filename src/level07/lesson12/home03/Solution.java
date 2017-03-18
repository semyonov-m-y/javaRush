package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum=-999999999;
        int  minimum=999999999;

        //напишите тут ваш код
        int[] mass = new int[20];
        for(int i=0; i<mass.length; i++){
            int n = Integer.parseInt(reader.readLine());
            mass[i] = n;
        }

        for(int i=0; i<mass.length; i++){
            if(mass[i]>maximum)
                maximum=mass[i];
        }

        for(int i=0; i<mass.length; i++){
            if(mass[i]<minimum)
                minimum=mass[i];
        }

        System.out.print(maximum + " ");
        System.out.println(minimum);
    }
}
