package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map= new HashMap<>();
        map.put("Иванов","Дмитрий");
        map.put("Петров","Иван");
        map.put("Сидоров","Иван");
        map.put("Грибоедов","Пётр");
        map.put("Сверов","Пётр");
        map.put("Сорокин","Александр");
        map.put("Свистунов","Александр");
        map.put("Комаров1","Евгений");
        map.put("Комаров","Александр");
        map.put("Крутой","Олег");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код

        //map.entrySet().removeIf(stringStringEntry -> Collections.frequency(map.,map.values()));
        /*Iterator<String> entries = map.values().iterator();
        while (entries.hasNext()) {
            String ent = entries.next();
            if(Collections.frequency(map.values(),ent)>1){
                //entries.remove();
                //removeItemFromMapByValue(map, ent);
                map.remove()
                System.out.println(ent);
            }


        }*/
        String val, key;
        List<String> list = new ArrayList<>();
        for (Map.Entry<String,String> pair : map.entrySet()) {
            val = pair.getValue();
            if(Collections.frequency(map.values(),val)>1){
                list.add(val);
            }
        }
        for (String vall: list ) {
            removeItemFromMapByValue(map,vall);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        HashMap<String, String> map = createMap();
//        removeTheFirstNameDuplicates(map);
//        System.out.println(map);
    }
}
