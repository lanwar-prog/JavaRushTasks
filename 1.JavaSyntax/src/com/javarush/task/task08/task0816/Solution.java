package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Мел Гибсон", df.parse("JUNE 3 1953"));
        map.put("Лесли Нильсон", df.parse("February 11 1926"));
        map.put("Орнелла Мути", df.parse("March 5 1926"));
        map.put("Петр Столыпин", df.parse("April 14 1852"));
        map.put("5", df.parse("May 5 1852"));
        map.put("6", df.parse("June 6 1852"));
        map.put("7", df.parse("July 7 1852"));
        map.put("8", df.parse("August 8 1852"));
        map.put("9", df.parse("September 9 1852"));


        //напишите тут ваш код

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        //Интересный вариант удаления месяца
        // map.values().removeIf(date -> date.toString().contains("Jun"));

        DateFormat sdf = new SimpleDateFormat("M");
        Iterator<Map.Entry<String, Date>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Date> ent = entries.next();
            //long entry = ent.getValue().getTime();
            int date = Integer.parseInt(sdf.format(ent.getValue()));
            if (date > 5 && date < 9) entries.remove();


            //System.out.println("ID = " + entry.getKey() + " Месяц = " + entry.getValue());
//            int sss = ent.getValue().getMonth();
//            System.out.println(sss);

        }
//        map.forEach((s, date) ->{
//            int datt = Integer.parseInt(sdf.format(date.getTime()));
//            if (datt >5&& datt <9) {
//                map.remove(s);
//            }
//        } );
    }

    public static void main(String[] args) throws ParseException {
// Инициализация вывода
/*       HashMap<String,Date> map = createMap();
       removeAllSummerPeople(map);
        DateFormat dff = new SimpleDateFormat("M");
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            System.out.println("Key: "+entry.getKey()+" Value: " +dff.format(entry.getValue()) );
        }*/
        //System.out.println(map);
    }
}