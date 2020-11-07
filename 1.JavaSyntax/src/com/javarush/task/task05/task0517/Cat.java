package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private String name = null;
    private int age = 7;
    private String address = null;
    private int weight = 3;
    private String color = "green";

    public Cat(String name) {
        this.name = name;
//        this.age = 5;
//        this.weight = 3;
//        this.color = "green";
    }


    public Cat(String name, int weight, int age ) {

        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight,  String color,String address) {
        this.address = address;
        this.weight = weight;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
