package com.bashynskiy.app.classwork.lesson12;

/**
 * Created by testu on 4/21/2017.
 */
public class Bicycle {
    public String color;
    public String wheelSize;
    public int price;
    public int speed;

    public Bicycle(String color) {
        this.color = "red";
    }
    public Bicycle(String color, String wheelSize){
       // this.color = color;
        //инициализация color через первый конструктор
        this(color);
        // дальше выполняется то чего нету в первом конструкторе
        this.wheelSize = wheelSize;
    }
    public Bicycle(){
        color = "white";
    }
    public Bicycle(String color, int speed, String wheelSize){
        this(color,wheelSize);
        this.speed = speed;

    }
    public Bicycle(String color, int speed, String wheelSize, int price){
        this(color, speed, wheelSize);
        this.price = price;
    }

}
