package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* 
Нашествие исключений
Заполни список exceptions десятью различными исключениями.
Первое исключение уже реализовано в методе initExceptions.

Требования:
1. Список exceptions должен содержать 10 элементов.
2. Все элементы списка exceptions должны быть исключениями (потомками класса Throwable).
3. Все элементы списка exceptions должны быть уникальны.
4. Метод initExceptions должен быть статическим.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Integer ints[] = new Integer[1];
            System.out.println(ints[1]);

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Object a[] = new Double[1];
            System.out.println(a[0] = '*');

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object ch = '*';
            System.out.println((Byte)ch);

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            Iterator<Integer> iter = list.iterator();
            while(iter.hasNext()){
                list.add(iter.next());
                //System.out.println();
            }

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Stack<String> catStack = new Stack<>();
            catStack.peek();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.get(1);

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Integer ints[] = new Integer[-1];
            //System.out.println(ints[1]);

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Integer ints[] = null;
            System.out.println(ints[1]);

        } catch (Exception e) {
            exceptions.add(e);
        }
        try
        {
            String szShortString = "123";
            char chr = szShortString.charAt(10);

        } catch (Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код

    }
}
