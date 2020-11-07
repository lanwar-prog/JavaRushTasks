package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String na = reader.readLine();
        int a = Integer.parseInt(na);
        String nb = reader.readLine();
        int b = Integer.parseInt(nb);
        String nc = reader.readLine();
        int c = Integer.parseInt(nc);

        if (a+b <= c || a+c <= b|| b+c <= a) {
            System.out.println("Треугольник не существует.");

        }else{
            System.out.println("Треугольник существует.");
        }


    }
}