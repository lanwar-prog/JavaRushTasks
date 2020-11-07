package com.javarush.task.task11.task1123;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        // напишите тут ваш код
        int[] temp=new int[inputArray.length];
        System.arraycopy(inputArray, 0, temp, 0, inputArray.length);
        //До сортировки
        // System.out.println(Arrays.toString(temp));
        Arrays.sort(temp);
        //После
        // System.out.println(Arrays.toString(temp));

//        Красивое решение
//        int x = Arrays.stream(inputArray).min().getAsInt();
//        int y = Arrays.stream(inputArray).max().getAsInt();

        return new Pair<Integer, Integer>(temp[0], temp[temp.length-1]);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
