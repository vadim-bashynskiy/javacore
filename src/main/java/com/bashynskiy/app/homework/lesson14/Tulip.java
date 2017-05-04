package com.bashynskiy.app.homework.lesson14;

/**
 * Created by admin on 04.05.2017.
 */
public class Tulip implements Flower {
    double price = 12.0;
    String name = "Tulip";
    @Override
    public double price(){
        return price;
    }
    @Override
    public String nameFlower(){
        return name;
    }
}
