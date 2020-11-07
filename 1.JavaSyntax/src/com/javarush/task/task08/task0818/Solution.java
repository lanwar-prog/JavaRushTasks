package com.javarush.task.task08.task0818;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map= new HashMap<>();
        map.put("Иванов",400);
        map.put("Петров",200);
        map.put("Сидоров",300);
        map.put("Грибоедов",100);
        map.put("Сверов",500);
        map.put("Сорокин",500);
        map.put("Свистунов",700);
        map.put("Комаров1",800);
        map.put("Комаров",900);
        map.put("Крутой",900);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        //Это лучший способ
        map.values().removeIf(integer -> integer<500);

        //Второй вариант
/*        Iterator<Map.Entry<String, Integer>> entry = map.entrySet().iterator();
        while (entry.hasNext()){
            Map.Entry<String, Integer> ent = entry.next();
            if (ent.getValue() < 500) {
               entry.remove();
            }
        }*/

        // Таким способом удаление не работает
       /* for (Map.Entry<String, Integer> ent: map.entrySet()             ) {
            if (ent.getValue() < 500) {
                map.remove(ent.getKey());
            }
        }*/
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);
        System.out.println(map);

    }
}