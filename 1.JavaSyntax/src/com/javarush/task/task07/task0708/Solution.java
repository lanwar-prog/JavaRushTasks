package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s =reader.readLine();
            strings.add(s);
        }
        //strings.sort(String::compareTo);
            int x=0;
        int ii=0;
        for (int i = 0; i < strings.size() - 1; i++) {
                String len1 = strings.get(i);
                String len2 = strings.get(i + 1);
                int intlen1 = len1.length();
                int intlen2 = len2.length();
                if (i == 0) {
                    if (intlen1 > intlen2) {
                        x = intlen1;
                        ii = i;
                    } else {
                        x = intlen2;
                        ii = i + 1;
                    }
                } else if (x < intlen2) {
                    x = intlen2;
                    ii = i + 1;
                }
        }
        for (int i = 0; i < strings.size(); i++) {
            String len1 = strings.get(i);
            int intlen1 = len1.length();

            if (x == len1.length()) {
                System.out.println(strings.get(i));
            }
        }


    }
}
