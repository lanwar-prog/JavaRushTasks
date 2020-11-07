package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); //
        //list.add("дачар"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            str = list.get(i);
                if (str.contains("р") && !str.contains("л")) {
                    list.remove(i);
                    i--;
                }else if (str.contains("л") && !str.contains("р")) {
                    i++;
                    list.add(i, str);
                    //++i;
                }
        }
        return list;
    }


//    public static ArrayList<String> fix(ArrayList<String> list) {
//        //напишите тут ваш код
//        String str;
//        for (int i = 0; i < list.size();i++) {
//            str = list.get(i);
//            if (!str.contains("л") && !str.contains("р")) {
//                //i++;
//            } else if (str.contains("р")) {
//                list.remove(i);
//                i--;
//            } else if (str.contains("л")) {
//                list.add(i++,str);
//                ++i;
//                //i=i+1;
//            }
//            //i++;
//        }
//        return list;
//    }
}