package com.bashynskiy.app.classwork.lesson6;

import java.util.Arrays;

/**
 * Created by testu on 3/24/2017.
 */
public class Loops {
    public static void loopsStatment(int a, int b) {
        while (a > b) {
            System.out.println(a-- + " " + b);
            if (a <= b) {
                System.out.println("a = " + a + " b = " + b);
            }
        }

    }

    public static void forLoop(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print("i =" + i);
        }
    }

    public void modNumber(int a) {
        int k = 0;
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                ++k;
                System.out.println("i = " + i);
            }
        }
        System.out.println(" Count = " + k);
    }

    public static void massive() {
        int[] intArray = {1, 2, 3};
        System.out.println(Arrays.toString(intArray));
    }

    public static void massDouble() {
        int[][] intArray = new int[2][3];

        for (int j = 0; j < intArray.length; j++) {

            for (int k = 0; k < intArray[j].length; k++) {
                intArray[j][k] = j * k;
                System.out.println(intArray[j][k]);
            }
        }
    }
}
