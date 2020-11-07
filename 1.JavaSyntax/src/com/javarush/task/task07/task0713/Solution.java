package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> listAll = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            int ints =Integer.parseInt(reader.readLine());
            listAll.add(ints);
        }
        for (int resListAll:listAll) {
            if (resListAll%3 == 0) {
                list1.add(resListAll);
              //  System.out.println("3 "+resListAll);
            }
            if (resListAll%2 == 0) {
                list2.add(resListAll);
             //   System.out.println("2 "+resListAll);
            }

            if(resListAll%3 != 0 && resListAll%2 != 0){
                list3.add(resListAll);
               // System.out.println("all "+resListAll);
            }

        }
        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int resListAll:list) {
            System.out.println(resListAll);
        }
    }
}
