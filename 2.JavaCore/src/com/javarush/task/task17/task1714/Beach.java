package com.javarush.task.task17.task1714;

/* 
Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach. Пляжи(Beach) будут использоваться нитями, поэтому позаботьтесь, чтобы
все методы были синхронизированы.
Реализовать метод compareTo так, чтобы он при сравнении двух пляжей выдавал число, которое показывает что первый пляж лучше
(положительное число)
или второй пляж лучше (отрицательное число), и насколько он лучше.

Требования:
1. Класс Beach должен содержать три поля: String name, float distance, int quality.
2. Класс Beach должен реализовывать интерфейс Comparable<Beach>.
3. Метод compareTo класса Beach как минимум должен учитывать качество пляжа и дистанцию.
4. Все методы класса Beach, кроме метода main, должны быть синхронизированы.
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach beach1 = new Beach("beach1", 31,3);
        Beach beach2 = new Beach("beach2", 30,6);

        System.out.println(beach1.compareTo(beach2));
    }

    @Override
    public synchronized int compareTo(Beach o) {

        int beach1 =0;
        int beach2 =0;
        if (this.distance < o.distance){
            beach1 +=1;
        }else if (this.distance > o.distance){
            beach2 +=1;
        }
        if (this.quality > o.quality){
            beach1 +=1;
        }else if (this.quality < o.quality){
            beach2 +=1;
        }

        if (beach1 > beach2) {
            return 1;
        } else if (beach1 < beach2) {
            return -1;
        }
        return 0;
        //Второй вариант решения
        //return Integer.compare(quality, o.quality) - Float.compare(distance, o.distance);
    }
}
