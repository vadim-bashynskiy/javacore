package com.bashynskiy.app.homework.lesson16;

/**
 * Created by admin on 19.05.2017.
 */

//Создать супер класс "Трактор" который унаследует абстрактный класс Machine.
// От заданного супер класса создать двух прямых потомков "Колесный" и "Гусеничный".
// Потомки должны реализовывать все методы, какие нереализованные в абстрактном классе.
// Данные методы должны выводить на экран информацию о транспорте.

public class Tractor extends Mashine {

    public Tractor(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void printNameTransport() {
    }

    @Override
    public void getSpeed() {
        System.out.println("Tractor max speed = " + MAX_SPEED);
    }

    @Override
    public void getMass() {

    }

    @Override
    public void peopleNumbers() {

    }

    @Override
    public void numberWheels() {

    }
}
