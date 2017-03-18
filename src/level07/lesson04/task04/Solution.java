package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int[] mass = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<mass.length; i++){
            mass[i] = Integer.parseInt(reader.readLine());
        }
        int[] mass1 = new int[10];
        for(int j=mass.length-1; j>=0; j--){
            mass1[j] = mass[mass1.length - j - 1];
        }
        for(int k=0; k<mass1.length; k++){
            mass[k] = mass1[k];
            System.out.println(mass[k]);
        }
    }
}
