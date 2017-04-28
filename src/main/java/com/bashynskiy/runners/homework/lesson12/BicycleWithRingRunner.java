package com.bashynskiy.runners.homework.lesson12;

import com.bashynskiy.app.homework.lesson12.Bicycle;
import com.bashynskiy.app.homework.lesson12.BicycleWithRing;
import com.bashynskiy.app.homework.lesson12.BicycleWithRingInterface;
import com.bashynskiy.app.homework.lesson12.CustomBicycle;

/**
 * Created by admin on 28.04.2017.
 */
public class BicycleWithRingRunner {
    public static void main(String[] args) {

        BicycleWithRingInterface bicycle = new BicycleWithRing();
        bicycle.ring();
        Bicycle bicycle1 = new CustomBicycle();
        bicycle1.ride();
        bicycle1.setGear(3);
        bicycle1.setSpeed(280);

    }
}
