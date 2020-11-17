package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.

Требования:
1. Программа должна три раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
3. Первую половину байт из первого файла нужно записать во второй файл.
4. Вторую половину байт из первого файла нужно записать в третий файл.
5. Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] filePath = new String[3];
        for (int i = 0; i < 3; i++) {
            filePath[i] =reader.readLine();
        }
        FileInputStream inputStreamFile1 = new FileInputStream(filePath[0]);
        FileOutputStream outPutStreamFile2 = new FileOutputStream(filePath[1]);
        FileOutputStream outPutStreamFile3 = new FileOutputStream(filePath[2]);
       // System.out.println(inputStreamFile1.available());
        if (inputStreamFile1.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStreamFile1.available()];
            int count = inputStreamFile1.read(buffer); //Считываем все байты в буфер и считаем количество в count
            System.out.println(count);
            if (count%2 == 1) {
                //Запись считанного buffer в файл, начиная с 0 позиции массива буфера в сумме колличества байт по формуле count/2
                outPutStreamFile2.write(buffer, 0, count/2+1);
                //Колличесво байт по формуле count/2 становится первой позицией массива буфера.
                outPutStreamFile3.write(buffer, count/2+1, count/2);
            }else{
                outPutStreamFile2.write(buffer, 0, count/2);
                outPutStreamFile3.write(buffer, count/2, count/2);
            }

        }
        reader.close();
        inputStreamFile1.close();
        outPutStreamFile2.close();
        outPutStreamFile3.close();
    }
}
