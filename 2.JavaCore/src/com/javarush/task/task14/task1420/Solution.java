package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* 
НОД
Давай найдем наибольший общий делитель (НОД). Для этого:
Введи с клавиатуры 2 целых положительных числа.
Выведи в консоли наибольший общий делитель.

Требования:
1. Программа должна считывать с клавиатуры 2 строки.
2. Если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
3. Программа должна выводить данные на экран.
4. Программа должна выводить на экран наибольший общий делитель (НОД) чисел, считанных с клавиатуры, и успешно завершаться.
*/


public class Solution {

    //Алгоритм поиска наибольшего делителя двух чисел
    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> listN1 = new ArrayList<>();
        List<Integer> listN2 = new ArrayList<>();
        TreeSet<Integer> setNod = new TreeSet<>();


            int n1 = Integer.parseInt(reader.readLine());
            //nt n2 = Integer.parseInt(reader.readLine());
        //System.out.println(gcd(n1, n2));

            if (n1 <=0) {
                throw new IllegalArgumentException("Введеное число меньше нуля");
            }
            for (int i = 1; i <= n1; i++) {
                if (n1%i==0) listN1.add(i);
            }
           int n2 = Integer.parseInt(reader.readLine());
            if (n2 <=0) {
                throw new IllegalArgumentException("Введеное число меньше нуля");
            }
            for (int i = 1; i <= n2; i++) {
                if (n2%i==0) listN2.add(i);
            }
            for (int nod: listN1) {
                for (int nod2: listN2) {
                    if (nod == nod2)
                        setNod.add(nod);
                }
            }
            System.out.println(setNod.last());
    }

}
