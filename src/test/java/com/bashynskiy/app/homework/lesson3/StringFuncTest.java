package com.bashynskiy.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by testu on 3/16/2017.
 */
public class StringFuncTest {
    @Test
    public void lenght() {
        String name = "Vadim";
        int actualResult = name.length();
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void toLowerCase() {
        String name = "VaDiM";
        String actualResult = name.toLowerCase();
        String expectedResult = "vadim";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void toUpperCase() {
        String name = "VaDim";
        String actualResult = name.toUpperCase();
        String expectedResult = "VADIM";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void stringTrim() {
        String text = "   Hello  ";
        String actualResult = text.trim();
        String expectedResult = "Hello";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void stringTrimMiddleCase() {
        String text = "   Hello my name is   ";
        String actualResult = text.trim();
        String expectedResult = "Hello my name is";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void substring() {
        String text = "Hello my name is";
        String actualResult = text.substring(3);
        String expectedResult = "lo my name is";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void substringBeginEnd() {
        String text = "Hello my name is";
        String actualResult = text.substring(3, 8);
        String expectedResult = "lo my";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void concat() {
        String part1 = "Hello my name is:";
        String part2 = "Vadim";
        String actualResult = part1.concat(part2);
        String expectedResult = "Hello my name is:Vadim";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void containsTrue() {
        String text = "Hello my name is:";
        boolean actualResult = text.contains("name");
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void containsFalse() {
        String text = "Hello my name is:";
        boolean actualResult = text.contains("Vadim");
        boolean expectedResult = false;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void equalsIgnoreCase() {
        String text = "Hello my name is:";
        String text2 = "HeLLo My NAMe Is:";
        boolean actualResult = text.equalsIgnoreCase(text2);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void equalsIgnoreCaseFalse() {
        String text = "Hello my name is:";
        String text2 = "HeLLo My NAMe I:";
        boolean actualResult = text.equalsIgnoreCase(text2);
        boolean expectedResult = false;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void empty() {
        String text = "";
        boolean actualResult = text.isEmpty();
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void emptyFalse() {
        String text = " ";
        boolean actualResult = text.isEmpty();
        boolean expectedResult = false;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void charAt() {
        String text = "Hello my name is:";
        int actualResult = text.charAt(3);
        int expectedResult = 108;
        Assert.assertEquals(expectedResult, actualResult);
    }

}
