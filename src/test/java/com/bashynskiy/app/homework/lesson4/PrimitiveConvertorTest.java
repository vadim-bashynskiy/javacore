package com.bashynskiy.app.homework.lesson4;

import com.bashynskiy.app.utils.convertors.PrimitiveConvertor;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Created by testu on 3/20/2017.
 */
public class PrimitiveConvertorTest {
    @Test
    public void floatToCharPositive() {
        float a = 71.6f;
        char actualResult = PrimitiveConvertor.floatToChar(a);
        char expectedResult = 'G';
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void floatToCharNegative() {
        float a = -30;
        char actualResult = PrimitiveConvertor.floatToChar(a);
        char expectedResult = 65506;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void intToCharBigger() {
        int a = 1160000000;
        char actualResult = PrimitiveConvertor.intToChar(a);
        char expectedResult = '㈀';
        Assert.assertEquals(expectedResult, actualResult);


    }

    @Test
    public void intToChar() {
        int a = 116;
        char actualResult = PrimitiveConvertor.intToChar(a);
        char expectedResult = 't';
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void charToInt() {
        char a = 't';
        int actualResult = PrimitiveConvertor.charToInt(a);
        int expectedResult = 116;
        Assert.assertEquals(expectedResult, actualResult);

    }

}