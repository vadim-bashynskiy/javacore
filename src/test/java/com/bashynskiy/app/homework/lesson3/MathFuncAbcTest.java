package com.bashynskiy.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by testu on 3/16/2017.
 */
public class MathFuncAbcTest {
    @Test
    public void intToDouble() {
        int a = -10;
        double actualResult = Math.abs(a);
        double expectedResult = 10.0;
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void intNegativeToDouble() {
        int a = -10;
        double actualResult = Math.abs(a);
        double expectedResult = 10.0;
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void intZeroToDouble() {
        int a = 0;
        double actualResult = Math.abs(a);
        double expectedResult = 0.0;
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void intNegativeZeroToDouble() {
        int a = -0;
        double actualResult = Math.abs(a);
        double expectedResult = 0.0;
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void intDoubleToDouble() {
        int a = (int) 10.746;
        double actualResult = Math.abs(a);
        double expectedResult = 10.0;
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

}
