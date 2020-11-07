package com.javarush.task.task07.task0707;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList("dd","sss","Dddd","ssss","hhhh"));
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
