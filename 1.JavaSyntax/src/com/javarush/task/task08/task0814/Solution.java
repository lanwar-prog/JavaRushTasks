package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            //set.add((int)(Math.random() * 20));
            set.add(i);
        }
        return set;
    }


    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // напишите тут ваш код
        //Новый способ удалить по условию из коллекции
set.removeIf(integer -> integer>10);
        return set;
    }

    public static void main(String[] args) {
//        HashSet<Integer> set =createSet();
//        System.out.println(set);
//                removeAllNumbersGreaterThan10(set);
//        System.out.println(set);
    }
}
