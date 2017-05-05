package com.bashynskiy.app.classwork.lesson15;

/**
 * Created by testu on 5/5/2017.
 */
public class Car {

    private Engine engine;
    private Navigation navigation;
    private ShiftGear shiftGear;
    private Wheel wheel;

    public Car(Engine engine,ShiftGear shiftGear) {
        this.engine = engine;
        this.shiftGear = shiftGear;
    }

    public Engine getEngine() {
        return engine;
    }

    public ShiftGear getShiftGear() {
        return shiftGear;
    }
    //не строгая копозиция

    public Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
