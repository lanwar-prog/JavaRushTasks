package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
Ввести с консоли имя файла.
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.

Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться минимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        FileInputStream inputStream = new FileInputStream(file);
        int minByte =0;
        // StringBuilder sum= new StringBuilder();
        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            int data = inputStream.read(); // прочитать очередной байт в переменную data
            // sum.append(data).append(" ");
            if (minByte == 0) minByte = data;
            if (data <= minByte) minByte = data;

        }
        System.out.println(minByte);
        //System.out.println(sum);
        inputStream.close(); //закрываем оба потока. Они больше не нужны.
        bufferedReader.close();

    }
}
