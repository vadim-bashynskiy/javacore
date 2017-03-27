package com.bashynskiy.app.classwork.lesson5;

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
    public static void forLoop(int a){
        for (int i = 0; i < a; i++) {
            System.out.print("i =" + i);
        }
    }
    public void modNumber(int a){
        int k =0;
        for (int i = 0; i < a; i++) {
            if (i%2 ==0){
                ++k;
                System.out.println("i = " + i);
            }
        }
        System.out.println(" Count = " + k);
    }
}
