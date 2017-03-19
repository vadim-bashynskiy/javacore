package com.bashynskiy.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by testu on 3/17/2017.
 */
public class CircleArea {
    static double circleArea;
    public static final double PI = 3.14;

    public static double calculateCircleArea(double radius) {
        return circleArea = PI * radius * radius;
    }

    public static double calculateBigger(double a, double b) {
        if (a > b || a == b) {
            return a;
        } else {
            return b;
        }
    }

}
