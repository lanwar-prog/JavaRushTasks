package com.javarush.task.task08.task0815;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap= new HashMap<>();
        hashMap.put("Петров1","Коля");
        hashMap.put("Иванов","Коля");
        hashMap.put("Петров","Иван");
        hashMap.put("Сидоров","Иван");
        hashMap.put("Грибоедов","Пётр");
        hashMap.put("Сверов","Пётр");
        hashMap.put("Сорокин","Александр");
        hashMap.put("Свистунов","Александр");
        hashMap.put("Комаров1","Александр");
        hashMap.put("Комаров","Александр");
        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        return Collections.frequency(map.values(), name);
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        return Collections.frequency(map.keySet(), lastName);
    }

    public static void main(String[] args) {
//        HashMap<String, String> map = createMap();
//        System.out.println(getCountTheSameFirstName(map, "Иван"));
//        System.out.println(getCountTheSameLastName(map, "Петров"));

    }
}
