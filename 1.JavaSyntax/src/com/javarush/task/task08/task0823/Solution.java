package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String[] ss = s.split("\\b");
        String aa="";
        for (String dd: ss
             ) {
            aa+=dd.substring(0,1).toUpperCase()+dd.substring(1);
        }
        System.out.println(aa);
    }
}
