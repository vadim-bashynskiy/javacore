package com.bashynskiy.app.classwork.lesson16_interface;

/**
 * Created by testu on 5/12/2017.
 */
public class ACMEBicycle extends BasicBycicle implements Bicycle,PartsStandart,Maintenence{
    private int cadence = 0;
    private int gear = 10;
    private int speed = 0;

    @Override
    public void changeGear(int newValue) {
        this.gear = newValue;
    }

    @Override
    public void changeCadence(int newValue) {
        this.cadence = newValue;
    }
    public void printStates(){
        System.out.println("Speed is " + speed);
    }

    @Override
    public void useEcoItems() {
        System.out.println("Create with Eco Items");
    }

    @Override
    public void clean() {
        System.out.println("Clean successful");
    }

    @Override
    public String toString() {
        return "ACMEBicycle{" +
                "cadence=" + cadence +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
