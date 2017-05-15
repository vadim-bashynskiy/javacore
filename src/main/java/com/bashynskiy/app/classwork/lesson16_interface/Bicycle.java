package com.bashynskiy.app.classwork.lesson16_interface;

/**
 * Created by testu on 5/12/2017.
 */
public interface Bicycle {
    int WHEEL_SIZE = 10;
    void changeGear(int newValue);
    void changeCadence(int newValue);
    default void showSpeed(){
        System.out.println("Speed is 10");
    }
}
