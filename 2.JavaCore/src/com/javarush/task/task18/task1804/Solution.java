package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
Ввести с консоли имя файла.
Найти байт или байты с минимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.

Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все байты из файла с минимальным количеством повторов.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        FileInputStream inputStream = new FileInputStream(file);
        List<Integer> list = new ArrayList<>();
        //long[] array = new long[256];

        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            int data = inputStream.read(); // прочитать очередной байт в переменную data
            list.add(data);
//            System.out.println(++array[data]);
        }
        Map<Integer,Integer> unique = new HashMap<>();
        for (Integer strInt : list) {
            unique.put(strInt, Collections.frequency(list, strInt));
        }
        for (Map.Entry<Integer,Integer> pair: unique.entrySet())
        {
            if (Collections.min(unique.values()).equals(pair.getValue())) {
                System.out.print(pair.getKey() + " ");
            }
        }

        inputStream.close(); //закрываем оба потока. Они больше не нужны.
        bufferedReader.close();
    }

}
