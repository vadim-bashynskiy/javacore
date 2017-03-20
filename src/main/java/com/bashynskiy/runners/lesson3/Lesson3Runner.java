package com.bashynskiy.runners.lesson3;
import com.bashynskiy.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by testu on 3/14/2017.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
       PrimitiveConvertor convertor = new PrimitiveConvertor();
        System.out.println( convertor.floatToChar(71.6f));
        System.out.println(convertor.charToInt('i'));
        System.out.println(convertor.intToChar(116));
    }
}
