package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
С консоли считать имя файла.
Посчитать в файле количество символов ',', количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ','.

Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должно выводится число запятых в считанном файле.
4. Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( new FileInputStream(sourceFileName)));
        int count = 0;
        while (bufferedReader.ready()){
            int symbol = bufferedReader.read();
            if ((char)symbol == ',') {
                count++;
            }
        }
        System.out.println(count);
        reader.close();
        bufferedReader.close();
    }

}
