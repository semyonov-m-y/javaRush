package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        InputStream inputStream = null;
        Reader inputStreamReader = null;
        try {
        inputStream = new FileInputStream("src\\DO NOT READ.txt");
        inputStreamReader = new InputStreamReader(inputStream);

        int data = inputStreamReader.read();
        while(data != -1){
            char theChar = (char) data;
            data = inputStreamReader.read();
            System.out.print(theChar);
        }
        } catch (FileNotFoundException e) {

        }
        finally
        {
            if (inputStream != null && inputStreamReader != null) {
            inputStreamReader.close();
            inputStream.close();
            }
        }
    }
}
