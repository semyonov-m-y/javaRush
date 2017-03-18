package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = null;
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
        while (true) {
            string = reader.readLine();
            if (string.equals("exit")) {
                writer.append(string);
                break;
            } else {
                writer.write(string);
                writer.write('\n');
                writer.flush();
            }
        }
        writer.close();
        reader.close();
    }
}
