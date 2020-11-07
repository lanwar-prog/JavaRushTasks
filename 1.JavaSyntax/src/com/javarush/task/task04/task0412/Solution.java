package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n = reader.readLine();
        int nAge = Integer.parseInt(n);
        if (nAge >0 ) {
          System.out.println(nAge*2);
        }else if (nAge < 0) {
            System.out.println(nAge+1);

        }else if (nAge == 0) {
            System.out.println(0);
        }
    }

}