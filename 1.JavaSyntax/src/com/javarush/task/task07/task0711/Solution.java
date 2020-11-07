package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s =reader.readLine();
            strings.add(s);
        }
        String tmp;
        for (int i = 0; i <13 ; i++) {
            //tmp=strings.get(strings.size()-1);
           // strings.remove(strings.size()-1);
            //        strings.add(0,tmp);
            strings.add(0,strings.remove(strings.size()-1));
        }
        for (String ss: strings) {
            System.out.println(ss);
        }

    }
}
