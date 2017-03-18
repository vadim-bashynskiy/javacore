package com.bashynskiy.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by testu on 3/17/2017.
 */
public class CircleArea {
    static int a = 10;
    static  int b =20;
    public static void calculateBegger(){
        System.out.println("Введите число а");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Введите число b");
        Scanner in2 = new Scanner(System.in);
        int b = in2.nextInt();
        if (a > b){
            System.out.println("а больше б");
        } else{
        System.out.println("б больше а");}

    }
}
