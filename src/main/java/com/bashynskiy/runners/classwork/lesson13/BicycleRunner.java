package com.bashynskiy.runners.classwork.lesson13;

        import com.bashynskiy.app.classwork.lesson13.Bicycle;

/**
 * Created by testu on 4/21/2017.
 */
public class BicycleRunner {
    public static void main(String[] args) {
        String color = "red";
        String wheelSize = "10";
        int price = 1200;
        int speed = 180;
        Bicycle bicycle1 = new Bicycle(color);
        Bicycle bicycle2 = new Bicycle(color,wheelSize);
        Bicycle bicycle3 = new Bicycle();
        Bicycle bicycle4 = new Bicycle(color,speed,wheelSize,price);

        System.out.println(bicycle1.color);
        System.out.println("Bicycle2 : " + bicycle2.color + " " + bicycle2.wheelSize);
        System.out.println(bicycle3.color);
        System.out.println("color = " + bicycle4.color + " wheelSize = " + bicycle4.wheelSize + " price = " + bicycle4.price);
    }

}
