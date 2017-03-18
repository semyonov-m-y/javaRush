package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double counter = 0;
        double avg = 0;
        while (true) {
            double num = Double.parseDouble(reader.readLine());
            if (num == -1) break;
            sum += num;
            counter++;
            avg = sum/counter;
        }
        System.out.println(avg);
    }
}

