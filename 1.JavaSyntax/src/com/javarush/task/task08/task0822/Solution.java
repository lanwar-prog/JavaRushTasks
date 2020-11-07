package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));

    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут

        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        List<Integer> list= new ArrayList<>();
        for (int j = 0; j <i ; j++) {
            Integer ints = Integer.parseInt(reader.readLine());
            list.add(ints);
        }
        return list;
    }
}
