package com.bashynskiy.app.homework.lesson16;

/**
 * Created by admin on 19.05.2017.
 */
public class CrawlerTractor extends Tractor {
    private String name;
    private int speed;
    private int mass;
    private int peopleNumber;
    private int numbersWheel;

    public CrawlerTractor(String name, int speed, int peopleNumber, int numbersWheel, int mass) {
        super(name, speed);
        this.name = name;
        this.speed = speed;
        this.numbersWheel = numbersWheel;
        this.peopleNumber = peopleNumber;
        this.mass = mass;
    }

    @Override
    public void printNameTransport() {
        System.out.println("Transport name is " + name);
    }

    @Override
    public void getSpeed() {
        System.out.println("Speed = " + speed);

    }

    @Override
    public void getMass() {
        System.out.println("Mass = " + mass);

    }

    @Override
    public void peopleNumbers() {
        System.out.println("People numbers = " + peopleNumber);

    }

    @Override
    public void numberWheels() {
        System.out.println("Numbers of wheeel = " + numbersWheel);

    }
}
