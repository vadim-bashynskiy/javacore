package com.bashynskiy.runners.classwork.lesson5;

import com.bashynskiy.app.classwork.lesson5.ArrayMath;
import com.bashynskiy.app.classwork.lesson5.Loops;

import java.util.Scanner;

/**
 * Created by testu on 3/24/2017.
 */
public class Lesson5Runner {
    public static void main(String[] args) throws InterruptedException {
        ArrayMath arrayMath = new ArrayMath();
        Loops loops = new Loops();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        int a = scanner.nextInt();
        System.out.println("enter b");
        int b = scanner.nextInt();
        Loops.loopsStatment(a, b);
        Loops.forLoop(10);
        loops.modNumber(21);
        arrayMath.mathTets();
        int c = 1;
        System.out.println("Original a value " + c);
        System.out.println("Post-increment a " + c++);
        System.out.println("After post-increment" + c);
        System.out.println("Pre-increment a  "+ ++c);
        System.out.println("After pre-incremen" + c);
    }
}
