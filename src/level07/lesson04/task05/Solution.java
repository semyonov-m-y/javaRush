package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int[] mass = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for(int i=0; i<mass.length; i++){
                mass[i] = Integer.parseInt(reader.readLine());
            }
        int[] mass1 = new int[10];
        int[] mass2 = new int[10];
            for(int j=0; j<10; j++){
                mass1[j] = mass[j];
            }
            for(int k=10; k<mass.length; k++){
                mass2[k-10] = mass[k];
                System.out.println(mass2[k-10]);
            }
    }
}
