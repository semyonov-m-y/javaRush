package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        int num = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (fileReader.ready()) {
            num = Integer.parseInt(fileReader.readLine());
            if (num % 2 == 0) {
               list.add(num);
            }
        }
        Collections.sort(list);

        for (Integer n : list) {
            System.out.println(n);
        }
        reader.close();
        fileReader.close();
    }
}
