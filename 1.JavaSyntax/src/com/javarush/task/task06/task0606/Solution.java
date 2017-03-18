package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        int j = Integer.parseInt(string);
        int res = 0;
        for (int i = 0; i < string.length(); i ++) {
            res = Integer.parseInt(String.valueOf(string.charAt(i)));
            if (res % 2 == 0) {
                even++;
            } else
                odd++;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
