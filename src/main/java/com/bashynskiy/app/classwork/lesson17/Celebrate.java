package com.bashynskiy.app.classwork.lesson17;

/**
 * Created by testu on 5/16/2017.
 */
public enum Celebrate {
    NEW_YEAR(1,"January","New Year"),MY_BIRTHDAY(28, "January", "My Birthday"), BROTER_BIRTHDAY(24, "March", "Brother birthday");
    private int number;
    private String month;
    private String description;

    Celebrate(int number, String month, String description) {
        this.number = number;
        this.month = month;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getMonth() {
        return month;
    }

    public String getDescription() {
        return description;
    }
}
