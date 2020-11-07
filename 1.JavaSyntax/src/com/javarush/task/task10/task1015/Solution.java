package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] array = new ArrayList[3];
        array[0]=new ArrayList<>();
        array[1]=new ArrayList<>();
        array[2]=new ArrayList<>();
        array[0].add("qqq");
        array[0].add("qqqaaaa");
        array[1].add("www");
        array[1].add("wwwssss");
        array[2].add("eee");
        array[2].add("eeedddd");


        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}