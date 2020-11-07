package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
В этой задаче тебе нужно:
Считать с консоли имя файла.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.

Требования:
1. Программа должна считывать c консоли имя файла.
2. Программа должна выводить на экран содержимое файла.
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
4. BufferedReader также должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();

        //Заменой меняем обратные слеши на прямые (Но принемает всё и без этого!)
        //System.out.println(sourceFileName.replace("\\", "//"));
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);

        // Читаем русскую кодировку из файла
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream,"UTF-8"));
//        int i;
//        while((i = bufferedReader.read())!= -1){
//            System.out.print((char)i);
//        }
        String line;
        while((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
            bufferedReader.close();
            fileInputStream.close();
    }
}