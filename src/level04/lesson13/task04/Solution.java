package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        for(int j = 0; j < 9; j++){
            System.out.print("8");
        }
        for(int i = 0; i < 11; i++){
            System.out.println("8");
        }
    }
}
