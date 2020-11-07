package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //int a = Integer.parseInt(reader.readLine());

        double a = Double.parseDouble(reader.readLine());
        double x = a%5;
       // int x=(int)a%10;

            //System.out.println(x);
        if (x < 3) {
            System.out.println("зелёный");
        }else if (x < 4) {
            System.out.println("жёлтый");
        }else if (x < 5) {
            System.out.println("красный");
        }
//            if ((x >= 0 && x < 3) || (x >= 5 && x < 7)) {
//                System.out.println("зелёный");
//            } else if ((x >= 3 && x < 4) || (x >= 7 && x < 9)) {
//                System.out.println("жёлтый");
//            } else if ((x >= 4 && x < 5) || (x >= 9)) {
//                System.out.println("красный");
//            }

    }
}