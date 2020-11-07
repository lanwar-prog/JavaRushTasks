package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int nStr = Integer.parseInt(reader.readLine());

        if (nStr%400 == 0||(nStr%4 == 0&&nStr%100 !=0)||(nStr%400 == 0&&nStr%100 ==0)) {

            System.out.println("количество дней в году: 366");
        }else {
            System.out.println("количество дней в году: 365");
        }

    }
}