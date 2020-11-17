package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.

Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
3. Во второй файл нужно записать все байты из первого в обратном порядке.
4. Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                //reader.readLine();
                FileInputStream inputStreamFile1 = new FileInputStream(reader.readLine());
                FileOutputStream outPutStreamFile2 = new FileOutputStream(reader.readLine())) {

            if (inputStreamFile1.available()>0) {
                byte[] buffer = new byte[inputStreamFile1.available()];
                int count = inputStreamFile1.read(buffer);
                for (int i = buffer.length-1; i >= 0 ; i--) {
                    outPutStreamFile2.write(buffer[i]);
                }
            }
        }
    }
}
