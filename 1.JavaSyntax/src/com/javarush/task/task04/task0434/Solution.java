package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
int i=1;

while (i<=10){
    int x=1;
    while (x<=10){
         System.out.print(i*x+" ");
        x++;
    }

    System.out.println();
    i++;

}
    }
}
