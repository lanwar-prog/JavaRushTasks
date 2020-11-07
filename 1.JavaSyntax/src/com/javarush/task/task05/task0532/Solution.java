package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer maximum= null;
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(reader.readLine());
                if (maximum==null || maximum <x ) maximum = x;
            }
            System.out.println(maximum);
        }

        //напишите тут ваш код


    }
}
