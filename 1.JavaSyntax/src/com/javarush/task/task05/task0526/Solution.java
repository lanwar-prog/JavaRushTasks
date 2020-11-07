package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 =new Man("Man1",12,"ssss");
        Man man2 =new Man("Man2",10,"wwww");
        System.out.println(man1);
        System.out.println(man2);
        Woman woman1 = new Woman("Women1",13,"eeeeee");
        Woman woman2 = new Woman("Women2",14,"rrrrrr");
        System.out.println(woman1);
        System.out.println(woman2);
    }


    //напишите тут ваш код
    public static class Man {
        private String name;
        private int age;
        private String address;
        public String toString() {
            return name + " " + age + " " + address;
        }
        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman {
        private String name;
        private int age;
        private String address;

        public String toString() {

            return name + " " + age + " " + address;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;

        }
    }

}
