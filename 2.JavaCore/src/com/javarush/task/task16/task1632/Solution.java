package com.javarush.task.task16.task1632;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/* 
Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. Нить 1 должна бесконечно выполняться;
1.2. Нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. Нить 3 должна каждые полсекунды выводить "Ура";
1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. Нить 5 должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.

Подсказка:
Нить 4 можно проверить методом isAlive()

Требования:
1. Статический блок класса Solution должен создавать и добавлять 5 нитей в список threads.
2. Нити из списка threads не должны стартовать автоматически.
3. Нить 1 из списка threads должна бесконечно выполняться.
4. Нить 2 из списка threads должна выводить "InterruptedException" при возникновении исключения InterruptedException.
5. Нить 3 из списка threads должна каждые полсекунды выводить "Ура".
6. Нить 4 из списка threads должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться.
7. Нить 5 из списка threads должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static Integer intsum =0;
    static {
        threads.add(new Thread(new Thread1(),"thread1"));
        threads.add(new Thread(new Thread2(),"thread2"));
        threads.add(new Thread(new Thread3(),"thread3"));
        threads.add(new Thread4());
        threads.add(new Thread(new Thread5(),"thread5"));
//        threads.get(0).start();
//        threads.get(1).start();
//        threads.get(2).start();
        threads.get(3).start();
        ((Thread4)threads.get(3)).showWarning();


        //Thread4 thred = (Thread4) threads.get(3);
        //thred.showWarning();
       //threads.get(3).
        //threads.get(3).showWarning();
//                Thread4 thred = new Thread4();
//                thred.showWarning();
        threads.get(4).start();


    }
    public static class Thread1 implements Runnable {

        @Override
        public void run() {
            while (true){

            }
        }
    }
    public static class Thread2 implements Runnable {
        //boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
        @Override
        public void run() {

                try {
                    while (!Thread.currentThread().isInterrupted()) {
                    //Thread.sleep(1);
                        //System.out.println("ss");
                        //threads.get(1).interrupt();
                        //Thread.currentThread().interrupt();
                    }
                    throw new InterruptedException();
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
//            while (!Thread.currentThread().isInterrupted()) {
//
//                 System.out.println("ss");
//            }
//            System.out.println("InterruptedException");
        }
    }
    public static class Thread3 implements Runnable {

        @Override
        public void run() {

                try {
                    while (true){
                        System.out.println("Ура");
                        Thread.sleep(500);

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
    public static class Thread4 extends Thread implements Message {

        @Override
        public void run() {
            while (!isInterrupted()){
                //showWarning();
                System.out.println("start");
            }
            System.out.println("finish");
        }

        @Override
        public void showWarning() {
            if ( isAlive()) {
                interrupt();
            }

        }
    }

    public static class Thread5 implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {

                    //int intsum = 0;
                    while (true) {
                        String reader = bufferedReader.readLine();
                        if (reader.equals("N")) {

                            break;
                        }
                        Integer ints = Integer.parseInt(reader);
                        intsum += ints;

                    }
                    System.out.println(intsum);
                    intsum = 0;
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (NumberFormatException e) {
                    System.out.println("no numbers");
                    //run();
                    continue;
                }
                break;
            }

        }
//        private void setnumb(){
//
//    }
    }
    public static void main(String[] args) {
    }
}