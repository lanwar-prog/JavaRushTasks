package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();

    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        //StackTraceElement[] element = Thread.currentThread().getStackTrace();
                //element[0].
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements)
//        {
//            System.out.println(element.getMethodName());
//        }
        //Arrays.stream(element).forEach(System.out::println);
        //System.out.println(element);
        System.out.println(stackTraceElements.length);
        return stackTraceElements.length;

    }
}

