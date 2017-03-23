package com.bashynskiy.app.homework.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by admin on 23.03.2017.
 */
@RunWith(JUnitParamsRunner.class)
public class MathAndStringTest {
    @Test
    @FileParameters(value = "src/test/resources/minList.csv", mapper = CsvWithHeaderMapper.class)
    public void minValue(int a, int b, int expRes) {
        Assert.assertEquals(expRes, Math.min(a, b));

    }

    @Test
    @FileParameters(value = "src/test/resources/maxList.csv", mapper = CsvWithHeaderMapper.class)
    public void maxValue(int a, int b, int expRes) {
        Assert.assertEquals(expRes, Math.max(a, b));

    }

    @Test
    @FileParameters(value = "src/test/resources/maxList.csv", mapper = CsvWithHeaderMapper.class)
    public void maxNotEqualsValue(int a, int b, int expRes) {
        Assert.assertNotEquals(expRes, Math.min(a, b));

    }

    @Test
    @FileParameters(value = "src/test/resources/minList.csv", mapper = CsvWithHeaderMapper.class)
    public void minNotEqualsValue(int a, int b, int expRes) {
        Assert.assertNotEquals(expRes, Math.max(a, b));
    }

    @Test
    @FileParameters(value = "src/test/resources/minList.csv", mapper = CsvWithHeaderMapper.class)
    public void sqrtValue(int a, int b, int expRes) {
        Assert.assertNotEquals(expRes, Math.max(a, b));
    }

    @Test
    @FileParameters(value = "src/test/resources/stringLength.csv", mapper = CsvWithHeaderMapper.class)
    public void lenght(String name, int expectedResult) {
        Assert.assertEquals(expectedResult, name.length());
    }

    @Test
    @FileParameters(value = "src/test/resources/stringNotEqualsLength.csv", mapper = CsvWithHeaderMapper.class)
    public void notEqualslenght(String name, int expectedResult) {
        Assert.assertNotEquals(expectedResult, name.length());
    }

    @Test
    @FileParameters(value = "src/test/resources/upperCase.csv", mapper = CsvWithHeaderMapper.class)
    public void upperCase(String text, String expectedResult) {
        Assert.assertEquals(expectedResult, text.toUpperCase());
    }

}