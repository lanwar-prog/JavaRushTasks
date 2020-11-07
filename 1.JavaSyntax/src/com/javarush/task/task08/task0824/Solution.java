package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human daughterNadya = new Human("Nadya",false,12 );
        Human daughterLena = new Human("Lena",false,10);
        Human sonMisha = new Human("Misha",true,15 );
        ArrayList<Human> children= new ArrayList<>();
        children.add(daughterLena);
        children.add(daughterNadya);
        children.add(sonMisha);

        Human fatherIvan = new Human("Ivan",true,45,children);

        ArrayList<Human> childrenFather= new ArrayList<>();
        childrenFather.add(fatherIvan);
        Human motherSveta = new Human("Sveta",false,40,children);
        ArrayList<Human> childrenMother= new ArrayList<>();
        childrenMother.add(motherSveta);


        Human grandfatherVasa = new Human("Vasa",true,63,childrenFather );
        Human grandmotherMariya = new Human("Mariya",false,60,childrenFather);

        Human grandfatherKola = new Human("Kola",true,63,childrenMother);
        Human grandmotherDina = new Human("Dina",false,59,childrenMother);
        //children.add()
        System.out.println(daughterLena);
        System.out.println(daughterNadya);
        System.out.println(sonMisha);

        System.out.println(fatherIvan);
        System.out.println(motherSveta);

        System.out.println(grandfatherVasa);
        System.out.println(grandmotherMariya);
        System.out.println(grandfatherKola);
        System.out.println(grandmotherDina);


    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children =new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
