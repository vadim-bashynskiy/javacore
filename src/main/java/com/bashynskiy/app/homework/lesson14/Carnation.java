package com.bashynskiy.app.homework.lesson14;

/**
 * Created by admin on 04.05.2017.
 */
public class Carnation implements Flower {
    double price = 10.0;
    String name = "Carnation";

    @Override
    public double price(){
        return price;
    }
    @Override
    public String nameFlower(){
        return name;
    }
}
