package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int numsum = 0;
        int i = 0;
        while (true) {


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(reader.readLine());

            if (number != -1) {
                i++;
                numsum += number;

            }else{
                System.out.println((double)numsum/i);
                break;
            }

        }
    }
}

