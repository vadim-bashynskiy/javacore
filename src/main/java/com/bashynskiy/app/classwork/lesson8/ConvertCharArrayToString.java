package com.bashynskiy.app.classwork.lesson8;

import java.util.Arrays;
import java.util.IdentityHashMap;

/**
 * Created by testu on 3/31/2017.
 */
public class ConvertCharArrayToString {
    public void convert(){
        String stringToDisplay = "";
        char[] charArrayToString = {'a','b','c','d'};
        for (int i = 0; i < charArrayToString.length ; i++) {
            stringToDisplay += charArrayToString[i];
        }
        System.out.println(stringToDisplay);
    }
    public void replace(){
        String stringToDisplay = "";
        char[] charArrayToString = {'a','b','c','d'};
        stringToDisplay = Arrays.toString(charArrayToString).replace("[", "").replace("]", "").replace(",", "");
        System.out.println(stringToDisplay);
    }
    public void primitiveConvert(){
        int intNumber= 333;
        double doubleNumbers = 12.23;
        long longNumber = 22222222;
        boolean booleanSymbol = true;
        String countIntStr = String.valueOf(intNumber);
        String countDoubleStr = String.valueOf(doubleNumbers);
        String countLongStr = String.valueOf(longNumber);
        String countBooleanStr = String.valueOf(booleanSymbol);
        Integer countInt = Integer.valueOf(countIntStr);
        Double countDouble = Double.valueOf(countDoubleStr);
        Long countLong = Long.valueOf(countLongStr);
        Boolean countBoolean = Boolean.valueOf(countBooleanStr);
        System.out.println(countInt);
        System.out.println(countDouble);
        System.out.println(countLong);
        System.out.println(countBoolean);
    }
}
