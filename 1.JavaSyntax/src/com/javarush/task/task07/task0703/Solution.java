package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] str = new String[10];
        int[] ints = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i <str.length ; i++) {
            str[i] = reader.readLine();

        }
        for (int i = 0; i <str.length ; i++) {
            if (str[i]!=null){
                String len=str[i];
                ints[i]=len.length();
                System.out.println(ints[i]);
            }

        }
    }

}
