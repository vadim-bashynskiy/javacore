package com.bashynskiy.app.classwork.lesson15;

/**
 * Created by testu on 5/5/2017.
 */
public class Chicago extends AbstractHouse {
    public Chicago(String name) {
        super(name);
    }

    @Override
    void build() {
        System.out.println("Build chicago house");
        showHouseNumber("137");
    }
}
