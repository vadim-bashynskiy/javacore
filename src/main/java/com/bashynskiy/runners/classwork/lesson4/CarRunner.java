package com.bashynskiy.runners.classwork.lesson4;

import com.bashynskiy.app.classwork.lesson4.Car;

/**
 * Created by testu on 3/17/2017.
 */
public class CarRunner {
    public static void main(String[] args) {
        Car lexus = new Car();
        lexus.name = "h300";
        Car toyota = new Car();
        toyota.name = "corolla";
        System.out.println(lexus.name + " " + Car.wheelCounter + Car.color);
        Car.driver();
        Car.openDoor();
        System.out.println(toyota.name + " " + Car.wheelCounter + Car.color);
        Car.driver();
        Car.openDoor();
        System.out.println(Car.SPEED);
    }
}

