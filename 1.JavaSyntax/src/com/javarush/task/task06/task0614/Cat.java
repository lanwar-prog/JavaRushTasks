package com.javarush.task.task06.task0614;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats;

    public Cat() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код

        //Cat cat;
        cats = new ArrayList<Cat>();
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        Iterator ir=cats.iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());
        }
    }
}
