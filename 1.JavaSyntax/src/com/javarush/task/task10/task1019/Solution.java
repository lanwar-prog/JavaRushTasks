package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String ,Integer> map = new HashMap<>();
        int id;
        String name;
while (true) {
try {
    id = Integer.parseInt(reader.readLine());
    name = reader.readLine();

//    if (name == null) {
//
//    }
}catch (NumberFormatException e){
    break;
}
    map.put(name, id);
}
        for (HashMap.Entry maps: map.entrySet()) {

            System.out.println(maps.getValue()+" "+  maps.getKey());

        }

        //System.out.println("Id=" + id + " Name=" + name);
    }
}
