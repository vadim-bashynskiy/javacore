package com.bashynskiy.app.homework.lesson19;

/**
 * Created by VBashynskyi on 26.05.2017.
 */
public class Contact {
    private String name;
    private String phone;

    public Contact() {
    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + ": " + phone;
    }
}
