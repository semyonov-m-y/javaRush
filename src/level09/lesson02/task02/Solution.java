package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        String methodName = element.getMethodName();
        return methodName;
    }

    public static String method2()
    {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        String methodName = element.getMethodName();
        return methodName;
    }

    public static String method3()
    {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        String methodName = element.getMethodName();
        return methodName;
    }

    public static String method4()
    {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        String methodName = element.getMethodName();
        return methodName;
    }

    public static String method5()
    {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        String methodName = element.getMethodName();
        return methodName;
    }
}
/*
stackTraceElements[0] - текущий метод
stackTraceElements[1] - вызвавший метод

Если функцию переиспользовать в разных методах, то

stackTraceElements[0] - текущий метод - утилитный
stackTraceElements[1] - текущий метод - целевой
stackTraceElements[2] - вызвавший метод - искомый
 */