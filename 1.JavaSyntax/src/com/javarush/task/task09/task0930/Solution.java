package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        //list.sort(Comparator.reverseOrder() );
        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        ArrayList<String> listString = new ArrayList<>();
        //listString.sort(Comparator.naturalOrder());
        ArrayList<Integer> listInts = new ArrayList<>();
        String[] arrayClon = array.clone();
        for (String x : array) {
            if (isNumber(x)) {
                listInts.add(Integer.parseInt(x));
            }else{
                listString.add(x);
            }
        }
        listInts.sort(Comparator.reverseOrder());
        //listInts.sort(Comparator.);
        //Collections.sort(listInts);
        Integer[] arrayInts = listInts.toArray(new Integer[0]);

        String[] arrayString = listString.toArray(new String[0]);

        //false - по убыванию true - по возрастанию
        //bSort(arrayInts,false);
        bSort(arrayString,true);
        //for (String x : arrayClon) {
        for (int i = 0,ii=0, ss=0; i < arrayClon.length; i++) {


            if (isNumber(arrayClon[i])) {
                array[i]=String.valueOf(arrayInts[ii]);
                ii++;
            }else{
                array[i]=arrayString[ss];
                ss++;

            }
        }



//        for (String x : array) {
//            System.out.println(x);
//        }
    }
    public static void bSort(String[] array,Boolean bool) {
        //напишите тут ваш код
        //Arrays.sort(array);
        String[] tmp = new String[1];
        for (int i = array.length-1; i >=0 ; i--) {
            for (int j = 0; j < i ; j++)
                if (isGreaterThan(array[j], array[j + 1])==bool) {
                    tmp[0] = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp[0];
                }
        }

    }
    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
