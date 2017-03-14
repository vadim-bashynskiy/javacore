package com.bashynskiy.app.utils.convertors;

/**
 * Created by testu on 3/14/2017.
 */
public class PrimitiveConvertor {
    int int1;
    float float1;
    char char1;
    double double1;

    public void floatToChar(float float1) {
        char1 = (char) float1;
        System.out.println(char1);
    }

    public void intToChar(int int1) {
        char1 = (char) int1;
        System.out.println(char1);
    }

    public void charToInt(char char1) {
        int1 = (int) char1;
        System.out.println(int1);
    }

}
