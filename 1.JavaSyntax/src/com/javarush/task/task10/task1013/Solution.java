package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.List;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
       private int height;
       private int age;
       private String name;
       private String address;
       private boolean sex;
       private List<String> children ;

        public Human(int height, int age, String name, String address, boolean sex, List<String> children) {
            this.height = height;
            this.age = age;
            this.name = name;
            this.address = address;
            this.sex = sex;
            this.children = children;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, boolean sex, List<String> children) {
            this.name = name;
            this.sex = sex;
            this.children = children;
        }

        public Human(int height, int age, String name, String address, boolean sex) {
            this.height = height;
            this.age = age;
            this.name = name;
            this.address = address;
            this.sex = sex;
        }

        public Human(int age, String name, List<String> children) {
            this.age = age;
            this.name = name;
            this.children = children;
        }

        public Human(String name, List<String> children) {
            this.name = name;
            this.children = children;
        }
        public Human() {

        }

        public Human(int height, String name, String address, List<String> children) {
            this.height = height;
            this.name = name;
            this.address = address;
            this.children = children;
        }
    }
}
