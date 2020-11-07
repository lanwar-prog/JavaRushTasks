package com.javarush.task.task15.task1509;

/* 
Мужчина или женщина?
Измени метод printName() так, чтобы он выполнялся для man и woman.
Реализация метода printName() должна быть одна.

Требования:
1. В классе Solution должен быть реализован только один метод printName().
2. Метод printName() должен принимать один параметр типа Human.
3. Класс Man должен быть потомком класса Human.
4. Класс Woman должен быть потомком класса Human.
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Human value) {
//        if (value instanceof Man) {
//            System.out.println(value.name);
//        } else if ( value instanceof Woman){
//            System.out.println(value.name);
//
//        }
        System.out.println(value.name);

    }

    public static class Human {
    private String name;
    public Human(String name){
        this.name = name;
    }
    }

    public static class Man extends Human {
        //public String name="man";
        public Man() {
            super("man");
        }
    }

    public static class Woman extends Human{
        //public String name= "woman";
        public Woman() {
            super("woman");
        }
    }
}
