package com.bashynskiy.app.classwork.lesson15;

/**
 * Created by testu on 5/5/2017.
 */
public abstract class AbstractHouse {
        private String name;
    abstract void build();

    public AbstractHouse(String name) {
        this.name = name;
    }

    public void showHouseNumber(String number){
        System.out.println("Number " + number);
    }
}
