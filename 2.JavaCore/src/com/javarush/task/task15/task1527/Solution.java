package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Парсер реквестов
Для решения этой задачи тебе нужно:
Считать с консоли URL-ссылку.
Вывести на экран список всех параметров через пробел (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert():
alert(double value) - для чисел (дробные числа разделяются точкой);
alert(String value) - для строк.
Обрати внимание на то, что метод alert() необходимо вызывать после вывода списка всех параметров на экран.
Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double: 3.14

Требования:
1. Программа должна считывать с клавиатуры только одну строку.
2. Класс Solution не должен содержать статические поля.
3. Программа должна выводить данные на экран в соответствии с условием.
4. Программа должна вызывать метод alert() с параметром double, если значение параметра obj можно корректно преобразовать в число типа double.
5. Программа должна вызывать метод alert() с параметром String, если значение параметра obj нельзя корректно преобразовать в число типа double.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String text = reader.readLine();

        //String text = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
        //String text = "http://javarush.ru/alpha/index.html?obj=31.4&name=Amigo";
        String[] res = text.split("\\?|&");


        //System.out.println(Arrays.toString(res[1].split("=")));
        String[] resSplitObj = new String[0];
        //resSplitObj[0] = "2";
        for (int i = 1; i < res.length; i++) {
            String[] resSplit = res[i].split("=");
            System.out.print(resSplit[0] + " ");
            if (resSplit[0].equals("obj")) {
                resSplitObj = resSplit;
                System.out.println(Arrays.toString(resSplit));
            }
        }
        System.out.println();
        try {
            alert(Double.parseDouble(resSplitObj[1]));
//            if (resSplitObj[1].contains(".")) {
//                alert(Double.parseDouble(resSplitObj[1]));
//            }else {
//                alert(resSplitObj[1]);
//            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }catch (NumberFormatException e) {
            alert(resSplitObj[1]);
        }
    }
    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
