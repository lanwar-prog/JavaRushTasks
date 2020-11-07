package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
Перегрузи метод printMatrix() 8 различными способами, чтобы в итоге у тебя получилось 10 различных методов printMatrix().

Требования:
1. В классе Solution должны быть реализованы 10 методов printMatrix() с различными аргументами.
2. Класс Solution должен быть public.
3. Все методы класса Solution должны быть статическими.
4. Все методы класса Solution должны быть публичными.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
//        printMatrix(2, 3, (byte)0b10);
//        printMatrix(2, 3, (short)7);
//        printMatrix(2, 3, 1);
//        printMatrix(2, 3, 2.2);
//        printMatrix(2, 3, '3');
//        printMatrix(2, 3, 4.3F);
//        printMatrix(2, 3, 6L);
//        printMatrix(2, 3, true);
//        printMatrix(2, 3, new ArrayList<>());

    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, byte value) {
        System.out.println("Заполняем объектами byte");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, short value) {
        System.out.println("Заполняем объектами short");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, int value) {
        System.out.println("Заполняем объектами int");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, double value) {
        System.out.println("Заполняем объектами double");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, char value) {
        System.out.println("Заполняем объектами char");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, float value) {
        System.out.println("Заполняем объектами float");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, long value) {
        System.out.println("Заполняем объектами long");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, boolean value) {
        System.out.println("Заполняем объектами boolean");
        printMatrix(m, n, (Object) value);
    }
//    public static void printMatrix(short m, short n, ArrayList value) {
//        System.out.println("Заполняем объектами Integer");
//        printMatrix(m, n, (Object) value);
//    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
