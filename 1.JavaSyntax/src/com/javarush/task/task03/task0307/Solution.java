package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zergA = new Zerg();
                zergA.name = "zergA";
        Zerg zergB = new Zerg();
                zergB.name = "zergB";
        Zerg zergC = new Zerg();
                zergC.name = "zergC";
        Zerg zergD = new Zerg();
                zergD.name = "zergD";
        Zerg zergE = new Zerg();
        zergE.name = "E";

        Protoss protossA = new Protoss();
        protossA.name = "protossA";
        Protoss protossB = new Protoss();
        protossB.name = "protossB";
        Protoss protossC = new Protoss();
        protossC.name = "protossC";

        Terran terranA = new Terran();
        terranA.name = "terranA";
        Terran terranB = new Terran();
        terranB.name = "terranB";
        Terran terranC = new Terran();
        terranC.name = "terranC";
        Terran terranD = new Terran();
        terranD.name = "terranD";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
