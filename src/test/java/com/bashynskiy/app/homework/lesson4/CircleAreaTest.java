package com.bashynskiy.app.homework.lesson4;

import com.bashynskiy.app.classwork.lesson4.CircleArea;
import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

/**
 * Created by testu on 3/20/2017.
 */
public class CircleAreaTest {
    @Test
    public void circleAreaDouble() {
        DecimalFormat decimalFormat = new DecimalFormat();
        double a = 10.99;
        double result = CircleArea.calculateCircleArea(a);
        String actualdResult = decimalFormat.format(result);
        String expectedResult = "379.25";
        Assert.assertEquals(expectedResult, actualdResult);

    }

    @Test
    public void circleAreaInt() {
        double a = 10;
        double actualResult = CircleArea.calculateCircleArea(a);
        int expectedResult = 314;
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void biggerFirstSymbol() {
        double a = 10;
        double b = 5;
        double actualResult = CircleArea.calculateBigger(a, b);
        double expectedResult = 10;
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void biggerSecondSymbol() {
        double a = 5;
        double b = 10;
        double actualResult = CircleArea.calculateBigger(a, b);
        double expectedResult = 10;
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void equallyNumbers() {
        double a = 5;
        double b = 5;
        double actualResult = CircleArea.calculateBigger(a, b);
        double expectedResult = 5;
        Assert.assertEquals(expectedResult, actualResult, 0);

    }
    @Test
    public void PifagoraHyp() {
        double a = 2;
        double b = 4;
        double actualResult = CircleArea.PifagorHypotenuza(a, b);
        double expectedResult = 4.47213595499958;
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

}
