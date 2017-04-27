package com.bashynskiy.runners.homework.lesson12;

import com.bashynskiy.app.homework.lesson12.BicycleWithRing;
import com.bashynskiy.app.homework.lesson12.BicycleWithRingInterface;
import com.bashynskiy.app.homework.lesson12.CustomBicycle;

/**
 * Created by admin on 28.04.2017.
 */
public class BicycleWithRingRunner {
    public static void main(String[] args) {
        BicycleWithRing bicycleWithRing = new BicycleWithRing();
        bicycleWithRing.ring();


        CustomBicycle customBicycle = new CustomBicycle();
        customBicycle.ride();
    }
}
