package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка четных чисел из файла
В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10

Требования:
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа, считанные из файла, отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла — FileInputStream.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(reader.readLine())) {
            // Читаем русскую из файла
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

            ArrayList<Integer> array = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                array.add(Integer.parseInt(line));
            }
            Collections.sort(array);
            //System.out.println(array);
            for (Integer xsort : array) {
                if (xsort % 2 == 0) {
                    System.out.println(xsort);
                }
                //System.out.println(sorted);
            }
        }

    }
}
