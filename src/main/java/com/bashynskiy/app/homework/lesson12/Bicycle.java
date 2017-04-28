package com.bashynskiy.app.homework.lesson12;

/**
 * Created by admin on 27.04.2017.
 */
//Написать класс абстрактный класс Bicycle с реализованным методом public void ride(), абстрактными методaми setSpeed() и setGear().
//Метод ride() выводит на экран строку “Wroom!”.
public abstract class Bicycle {
    public void ride(){
        System.out.println("Wroom!");
    }
   public abstract void setSpeed(int speed);
    public abstract void setGear(int gear);
}
