package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));

    }

    public static boolean isDateOdd(String date) throws ParseException {

        //String date = "MAY 1 2013";
        //Форматируем строку даты в нужный регистр
        //String dd = date.substring(0,1)+date.substring(1).toLowerCase();
        //System.out.println(dd);
        //Задаем шаблон считывания даты
        DateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        //Конвертируем строку даты
        Date dat = format.parse(date);
        Calendar calendar = new GregorianCalendar();
        //Устанавливаем дату в календарь
        calendar.setTime(dat);
        //System.out.println(calendar.get(Calendar.DAY_OF_YEAR));


        return calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0;

        //return (new Date(date).getDay() - 1) % 2 != 0;
    }
}
