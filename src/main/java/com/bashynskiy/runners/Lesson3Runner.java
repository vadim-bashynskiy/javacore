package com.bashynskiy.runners;

import com.bashynskiy.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by testu on 3/14/2017.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        convertor.floatToChar(71.6f);
        convertor.charToInt('i');
        convertor.intToChar(116);
    }
}
