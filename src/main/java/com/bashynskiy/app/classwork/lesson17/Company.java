package com.bashynskiy.app.classwork.lesson17;

/**
 * Created by testu on 5/16/2017.
 */
public enum Company {
    EBAY(30,"Ebay Inc"), GOOGLE(15,"Google Inc");
    private int value;
    private String fullName;

    Company(int value, String fullName) {
        this.value = value;
        this.fullName = fullName;
    }

    public int getValue() {
        return value;
    }

}
