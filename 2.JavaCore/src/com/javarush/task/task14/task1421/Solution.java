package com.javarush.task.task14.task1421;

/* 
Singleton
Класс является синглтоном (реализует паттерн Singleton), если позволяет создать всего один объект своего типа.

Реализуй Singleton pattern:
Создай класс Singleton в отдельном файле.
Добавь в него статический метод getInstance().
При любом вызове метода getInstance он должен возвращать один и тот же объект класса Singleton при любом вызове метода getInstance.
Подумай, каким образом можно запретить создание других объектов этого класса.
Сделай все конструкторы в классе Singleton приватными (private).
В итоге должна быть возможность создать объект (экземпляр класса) используя только метод getInstance.

Требования:
1. Класс Singleton должен быть создан в отдельном файле.
2. Класс Singleton не должен позволять создавать объекты своего типа извне класса.
3. Класс Singleton должен содержать приватное статическое поле instance типа Singleton.
4. В классе Singleton должен быть реализован публичный статический метод getInstance() возвращающий значение поля instance.
5. Метод getInstance должен всегда возвращать один и тот же объект.
*/
public class Solution {
    public static void main(String[] args) {
       // Singleton.getInstance();
        //Singleton singleton = new Singleton();
    }
}
