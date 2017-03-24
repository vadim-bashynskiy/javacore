package com.bashynskiy.app.homework.lesson4.lesson6;

import java.util.ArrayList;

/**
 * Created by admin on 24.03.2017.
 */
public class ArrayNumbers {
    public static void arrayEvenNumbers() {
        int[] evenList = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int k = 0;
        while (k != evenList.length) {
            for (int i = 0; i < evenList.length; i++) {
                System.out.print(evenList[i] + " ");
            }
            k = evenList.length;
        }
        System.out.println();
        for (int j = 0; j < evenList.length; j++) {
            System.out.println(evenList[j] + " ");
        }

    }
    public static void arrayEvenNumbersCreate(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] evenList = new int[21];
        int k = 0;
        while (k != evenList.length){
        for (int i = 1; i < evenList.length ; i++) {
            if (i % 2 == 0) {
                    list.add(i);
                }
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }

            }k=evenList.length;

        }/*
            System.out.println();
            for (int i = 0; i < evenList.length; i++) {
                System.out.println(evenList[i] + " ");
            k = evenList.length;
        }*/

        }
       /* int k = 0;
        while (k != evenList.length) {
            for (int i = 0; i < evenList.length; i++) {
                System.out.print(evenList[i] + " ");
            }
            k = evenList.length;
        }
        System.out.println();
        for (int j = 0; j < evenList.length; j++) {
            System.out.println(evenList[j] + " ");
        }*/




    public static void main(String[] args) {
        //arrayEvenNumbers();
        arrayEvenNumbersCreate();
    }
    /*Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же
    массив выведите на экран в другую строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
*/

}

