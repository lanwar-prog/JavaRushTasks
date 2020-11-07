package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] ints = new int[20];
        int[] min1 = new int[10];
        int[] min2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i <ints.length ; i++) {
            ints[i] = Integer.parseInt(reader.readLine());

        }
        for (int i = 0; i < ints.length; i++) {
            if (i < min1.length) {
                min1[i] = ints[i];
            } else {
                //int j=i-5;
                    System.out.println(min2[i-min1.length] = ints[i]);

            }
        }
    }
}
