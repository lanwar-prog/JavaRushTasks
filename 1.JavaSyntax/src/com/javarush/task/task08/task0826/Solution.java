package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        Arrays.sort(array);
        for (int start = 0, end = array.length - 1; start <= end; start++, end--) {
            int aux = array[start];
            array[start]=array[end];
            array[end]=aux;
        }


        //Так не работает
        /*int[] array2 = new int[array.length];
        for (int j=0, i = array.length-1; i >=0 ; i--, j++) {
            array2[j]=array[i];
        }*/
        //Integer[] array2 = Arrays.copyOf(array,array.length);
 /*       for (int l: array             ) {
            System.out.println(l);
        }*/

    }
}
