package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a > 99&& a <1000) {
            if (a%2 == 0) {
                System.out.println("четное трехзначное число");
            }else{
                System.out.println("нечетное трехзначное число");
            }

        }else if (a > 9&& a <100) {
            if (a%2 == 0) {
                System.out.println("четное двузначное число");
            }else{
                System.out.println("нечетное двузначное число");
            }
        }else if(a >0&& a <10){
            if (a%2 == 0) {
                System.out.println("четное однозначное число");
            }else{
                System.out.println("нечетное однозначное число");
            }
        }
    }
}
