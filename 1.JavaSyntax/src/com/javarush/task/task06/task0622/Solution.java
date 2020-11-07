package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int n4 = Integer.parseInt(reader.readLine());
        int n5 = Integer.parseInt(reader.readLine());
//int n1=7, n2=2 ,n3=5, n4=3, n5=6;
        for (int i = 0; i <4 ; i++) {
            if (n1 > n2) {
                int tmp;
                tmp = n1;
                n1 = n2;
                n2 = tmp;
            }
            if (n2 > n3) {
                int tmp;
                tmp = n2;
                n2 = n3;
                n3 = tmp;
            }
            if (n3 > n4) {
                int tmp;
                tmp = n3;
                n3 = n4;
                n4 = tmp;
            }
            if (n4 > n5) {
                int tmp;
                tmp = n4;
                n4 = n5;
                n5 = tmp;
            }

        }
        System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n5);
        //напишите тут ваш код

    }

}
