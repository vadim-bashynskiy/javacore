package com.bashynskiy.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by testu on 3/15/2017.
 */
public class MathFuncTest {
    MathFunc mathFunc = new MathFunc();

    @Test
    public void multiplyTest() {
        //precondition
        int a = 1;
        int b = 2;
        //create object
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.multiply(a, b);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sumTest() {
        int c = 3;
        int d = 5;
        int actualResult = mathFunc.sum(c, d);
        int expectedResult = 8;
        Assert.assertEquals(expectedResult, actualResult);
    }
}
