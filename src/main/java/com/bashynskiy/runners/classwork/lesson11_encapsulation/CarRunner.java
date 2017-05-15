package com.bashynskiy.runners.classwork.lesson11_encapsulation;

import com.bashynskiy.app.classwork.lesson11_encapsulation.Car;

/**
 * Created by testu on 4/28/2017.
 */
public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();
       /* car.name = "BMW";
        System.out.println(car.name);*/
        System.out.println(car.getName());

    }
}
