package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        //System.out.println(a);
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a ==b&&a!=c) {
            System.out.println(3);

        }else if (a == c&&c!=b){
            System.out.println(2);

        }else if(b==c){
            System.out.println(1);
        }
    }
}
