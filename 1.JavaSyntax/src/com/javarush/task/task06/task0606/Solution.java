package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       //int number = Integer.parseInt(reader.readLine());
        String s =reader.readLine();
        int n=s.length();

        for (int i = 0; i < n; i++) {
            if(s.charAt(i)%2 == 0){
                even++ ;
            }else{
                odd++;
            }
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
