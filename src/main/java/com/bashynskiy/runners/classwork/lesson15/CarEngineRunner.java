package com.bashynskiy.runners.classwork.lesson15;

import com.bashynskiy.app.classwork.lesson15.*;

/**
 * Created by testu on 5/5/2017.
 */
public class CarEngineRunner {
    public static void main(String[] args) {
        String engineName = "V8Turbo";
        String shiftGearName = "Mechanik";
        Engine engine = new Engine(engineName);
        ShiftGear shiftGear = new ShiftGear(shiftGearName);
        //строгая композиуция после того как мы установили значения мы не можем
        //его видоизменить
        Car car = new Car(engine,shiftGear);
        System.out.println(car.getEngine().getName());
        System.out.println(car.getShiftGear().getName());
        //не строгая композиция
        Navigation navigation = new Navigation();
        navigation.setName("Google");
        car.setNavigation(navigation);
        Navigation navigationGarmin = new Navigation();
        navigationGarmin.setName("Garmin");
        car.setNavigation(navigation);
        Wheel wheel = new Wheel();
        wheel.setName("Rosava");
        car.setWheel(wheel);
        System.out.println(car.getWheel().getName());

        //all information

        System.out.println("Engine = " + car.getEngine().getName() + " shiftGear = "+ car.getShiftGear().getName() + " Wheel = " + car.getWheel().getName());

    }
}
