package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int maxint=0;
        int count=1;
        for (int i = 1; i <list.size() ; i++) {
            if (list.get(i-1).equals(list.get(i))) {
               count++;
            }else {
               count=1;
            }
            if (maxint < count) maxint = count;
        }
        System.out.println(maxint);
    }
}