package com.bashynskiy.app.classwork.lesson12;

/**
 * Created by testu on 4/25/2017.
 */
public class BMW extends Car {
    String name = "BMW";
    //переопределение метода
    @Override
    public void drive() {
        System.out.println(name + " is driving");
    }
}
