package com.bashynskiy.app.homework.lesson14;

/**
 * Created by admin on 04.05.2017.
 */
public class Rose implements Flower {
    double price = 20.0;
    String name = "Rose";
    @Override
    public double price(){
        return price;
    }
    @Override
    public String nameFlower(){
        return name;
    }
}
