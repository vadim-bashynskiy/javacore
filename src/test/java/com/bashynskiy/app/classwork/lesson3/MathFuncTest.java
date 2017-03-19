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
        double actualResult = mathFunc.multiply(a, b);
        double expectedResult = 2;
        Assert.assertEquals(expectedResult,actualResult,0);
    }

    @Test
    public void sumTest() {
        double c = 3;
        double d = 5;
        double actualResult = mathFunc.sum(c, d);
        double expectedResult = 8;
        Assert.assertEquals(expectedResult,actualResult,0);
    }
}
