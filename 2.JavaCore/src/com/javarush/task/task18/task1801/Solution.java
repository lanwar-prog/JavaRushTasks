package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться максимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        FileInputStream inputStream = new FileInputStream(file);
        int maxByte =0;
       // StringBuilder sum= new StringBuilder();
        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            int data = inputStream.read(); // прочитать очередной байт в переменную data
           // sum.append(data).append(" ");
            if (data >= maxByte) maxByte=data;
        }
        System.out.println(maxByte);
        //System.out.println(sum);
        inputStream.close(); //закрываем оба потока. Они больше не нужны.
        bufferedReader.close();

    }
}
