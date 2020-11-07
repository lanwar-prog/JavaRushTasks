package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
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
        int tmp= strings.get(0).length();
        for (int i = 1; i < strings.size(); i++) {
            if (tmp > strings.get(i).length())
                tmp = strings.get(i).length();
        }

        for (int i = 0; i< strings.size() ; i++) {
            if (tmp == strings.get(i).length())
                System.out.println(strings.get(i));
        }

    }
}
