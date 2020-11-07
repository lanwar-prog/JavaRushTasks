package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
       Human dedVasa = new Human("Вася",true,55);
       Human dedKolya = new Human("Kolya",true,50);
       Human babkaMaria = new Human("Maria",false,40);
       Human babkaSveta = new Human("Sveta",false,39);

       Human otecDmitriy = new Human("Sveta",true,30,dedKolya,babkaMaria);
       Human mamaNadya = new Human("Nadya",false,31,dedVasa,babkaSveta);
       Human sinDenis = new Human("Denis",true,12,otecDmitriy,mamaNadya);
       Human sinBoris = new Human("Boris",true,11,otecDmitriy,mamaNadya);
       Human doshDarya = new Human("Darya",false,9,otecDmitriy,mamaNadya);
        System.out.println(dedVasa);
        System.out.println(dedKolya);
        System.out.println(babkaMaria);
        System.out.println(babkaMaria);
        System.out.println(otecDmitriy);
        System.out.println(mamaNadya);
        System.out.println(sinDenis);
        System.out.println(sinBoris);
        System.out.println(doshDarya);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        public Human(String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}