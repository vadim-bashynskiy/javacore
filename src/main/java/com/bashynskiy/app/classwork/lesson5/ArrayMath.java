package com.bashynskiy.app.classwork.lesson5;

/**
 * Created by testu on 3/24/2017.
 */
public class ArrayMath {
    public void mathTets() {
        int[] a = {1, 2, 3};
        a[0] = 1;
        a[1] = 3;
        a[2] = 2;
        for (int eventlist : a) {
            System.out.println(eventlist);
        }
            int[] arrayInt = new int[2];
            arrayInt[0] = 1;
            arrayInt[1] = 2;
            System.out.println("new array case");
            System.out.print(arrayInt);
    }

}
