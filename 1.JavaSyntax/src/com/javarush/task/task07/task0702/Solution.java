package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] sArray = initializeArray();
        print(sArray);

    }

    public static String[] initializeArray() throws IOException {
        // создай и заполни массив
        String[] strings = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //
        for (int i = 0; i < strings.length-2; i++) {
            strings[i] = reader.readLine();
        }
        return strings;
    }
    public static void print(String[] sArray) {

        for (int i = sArray.length-1; i >= 0; i--) {

            System.out.println(sArray[i]);
        }

    }

}