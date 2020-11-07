package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        int[] countAbc = new int[abc.length()];
        for (int i = 0; i < alphabet.size(); i++) {
            int count = 0;
            for (String str : list) {
                char[] strArray = str.toCharArray();
                //int c =Collections.frequency(strArray,alphabet.get(i));
                for (char ch : strArray) {
                    if (ch == alphabet.get(i)) {
                        count++;
                    }
                    countAbc[i] = count;
                }
            }
        }
        for (int i = 0; i < abcArray.length; i++) {
            System.out.println(abcArray[i] + " " + countAbc[i]);
        }
    }

}
