package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name = null;
    private int age = 7;
    private String address = null;
    private int weight = 3;
    private String color = null;

    public void initialize(String name){
        this.name =name;
        this.age=5;
        this.weight=5;
        this.color="green";
    }
    public void initialize(String name,int weight, int age){
        this.name =name;
        this.weight = weight;
        this.age = age;
        this.color="green";
    }
    public void initialize(String name, int age){
        this.name =name;
        this.age=age ;
    }
    public void initialize(int weight,String color){
        this.weight = weight;
        this.color = color;
       }
    public void initialize(int weight,String color,String address){
        this.weight = weight;
        this.color = color;
        this.address =address;
    }
    public static void main(String[] args) {

    }
}
