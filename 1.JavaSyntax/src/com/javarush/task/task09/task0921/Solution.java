package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                int number = Integer.parseInt(reader.readLine());
                list.add(number);
            }
        } catch (NumberFormatException e) {
            for (int n :
                    list) {
                System.out.println(n);
            }
        } catch (IOException e){
    }
    }
}
