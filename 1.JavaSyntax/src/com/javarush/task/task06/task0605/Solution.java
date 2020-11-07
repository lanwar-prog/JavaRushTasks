package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double massIndex = weight/(height*height);
            String result=" ";


            if (massIndex <18.5) {
                result = "Недовес: меньше чем 18.5";
            }else if (massIndex > 18.5 && massIndex < 24.9) {
                result ="Нормальный: между 18.5 и 24.9";
            } else if (massIndex > 25 && massIndex < 29.9) {
                result ="Избыточный вес: между 25 и 29.9";
            }else if (massIndex >=30) {
                result = "Ожирение: 30 или больше";
            }
            System.out.print(result);

            }
        }
    }

