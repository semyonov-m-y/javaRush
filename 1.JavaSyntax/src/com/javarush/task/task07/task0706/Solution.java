package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int even = 0;
        int odd = 0;
        int[] index = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < index.length; i++) {
            int j = Integer.parseInt(reader.readLine());
            if (i == 0 | i % 2 == 0) {
                even += j;
            } else if (i % 2 != 0) {
                odd += j;
            }
        }

        if (odd > even) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else if (odd < even) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}
