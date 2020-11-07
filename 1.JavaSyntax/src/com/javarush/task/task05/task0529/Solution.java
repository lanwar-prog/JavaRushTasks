package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numsum = 0;
        while (true) {
            String s = reader.readLine();
            if (s.equals("сумма")) {
                System.out.println(numsum);
                break;
            } else {
                numsum += Integer.parseInt(s);

            }
        }
    }
}
