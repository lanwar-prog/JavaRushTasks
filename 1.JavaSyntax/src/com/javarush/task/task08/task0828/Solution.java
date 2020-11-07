package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        System.out.println(month+" is the "+getNumMonth(month)+" month");

        //Достаточно только трех строчек и всё работает
        /*Calendar now = Calendar.getInstance();
        Map< String, Integer> representations = now.getDisplayNames(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
        System.out.printf(month+" is the "+(representations.get(month)+1)+" month");
        */
    }
    public static int getNumMonth(String month){
        Map<String,Integer> map = generateCalendar();

        return map.get(month.toUpperCase());
    }
    public static Map<String,Integer> generateCalendar(){
        Map<String,Integer> map =new HashMap<>();
        Calendar now = new GregorianCalendar();
        for (int i = 0; i <12 ; i++) {
            now.set(Calendar.MONTH,i);
            String m = now.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
            map.put(m.toUpperCase(),i+1);
        }
        return map;
    }
}
