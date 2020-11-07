package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String str = Integer.toString(number);

        int a =  str.charAt(0);
        int b =  str.charAt(1);
        int c =  str.charAt(2);
        int aa=Character.getNumericValue(a);
        int bb=Character.getNumericValue(b);
        int cc=Character.getNumericValue(c);
        return aa+bb+cc;
       // return number/100 + number%100/10 + number%10 \\ правильное решение
    }
}