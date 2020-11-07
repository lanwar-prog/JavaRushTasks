package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String s =reader.readLine();
            strings.add(s);
        }
        int tmp= strings.get(0).length();
        int tmp2= tmp;
        int imax=0;
        int imin=0;
        for (int i = 1; i < strings.size() ; i++) {
            if (tmp < strings.get(i).length() ) {
                tmp= strings.get(i).length();
                imax = i;
            }
            if (tmp2 > strings.get(i).length() ) {
                tmp2= strings.get(i).length();
                imin = i;
            }
        }
        //int x = imax > imin? imin: imax;
        System.out.println(strings.get(imax > imin? imin: imax));
        //strings.get(imax)+" "+strings.get(imin)
    }
}
