package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
       // List<String> addresses = new ArrayList<>();
        Map<String,String> familyMap = new HashMap<>();

        while (true) {
            String city = reader.readLine();
            if (city.isEmpty() ) break;
            String family = reader.readLine();
            if (family.isEmpty() ) break;
            familyMap.put(city,family);
            //addresses.add(family);
        }

        // Read the house number
        //int houseNumber = Integer.parseInt(reader.readLine());
        String city= reader.readLine();

        if (!city.isEmpty()) {
            String familyName = familyMap.get(city);
            System.out.println(familyName);
        }
    }
}
