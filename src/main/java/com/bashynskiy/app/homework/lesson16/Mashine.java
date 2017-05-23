package com.bashynskiy.app.homework.lesson16;

/**
 * Created by admin on 19.05.2017.
 */

public abstract class Mashine implements Run {
    int MAX_SPEED = 90;
    int MIN_SPEED = 60;
    int MIN_COUNT_PEOPLE = 10;
    int MAX_COUNT_PEOPLE = 30;
    protected String name;
    protected int speed;

    public Mashine(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void printNameTransport() {
    }
}
