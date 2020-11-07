package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "yyyy-MM-dd");
        Date date = simpleDateFormat.parse(str);
//        Calendar calendar = new GregorianCalendar();
//        calendar.setTime(date);
//        System.out.println(calendar.getDisplayName(Calendar.MONTH,Calendar.SHORT,Locale.ENGLISH).toUpperCase()+
//                " "+calendar.get(Calendar.DAY_OF_MONTH)+", "+ calendar.get(Calendar.YEAR));
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        System.out.println(dateFormat1.format(date).toUpperCase());
    }
}
