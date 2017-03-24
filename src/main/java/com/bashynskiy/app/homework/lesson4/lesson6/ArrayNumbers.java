package com.bashynskiy.app.homework.lesson4.lesson6;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by admin on 24.03.2017.
 */
public class ArrayNumbers {
    public static void arrayEvenNumbers() {
        int[] evenList = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < evenList.length; i++) {
            System.out.print(evenList[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < evenList.length; j++) {
            System.out.println(evenList[j] + " ");
        }

    }

    public static void arrayEvenNumbersCreate() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + " ");
        }

        System.out.println();
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j) + " ");
        }
    }

    public static void massEven() {
        int max = 20;
        int[] mass = new int[max / 2 + 1];
        for (int i = 1; i < mass.length; i++) {
            System.out.print((mass[i] = i * 2) + " ");
        }
        System.out.println();
        for (int i = 1; i < mass.length; i++) {
            System.out.println((mass[i] = i * 2) + " ");
        }
    }

    public static void massNotEven() {
        int max = 99;
        int[] mass = new int[max / 2 + 1];
        for (int i = 0; i < mass.length; i++) {
            System.out.print((mass[i] = i * 2 + 1) + " ");
        }
        System.out.println();
        for (int i = mass.length - 1; i > -1; i--) {
            System.out.print((mass[i] = i * 2 + 1) + " ");
        }
    }

    //Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
    // Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
    public static void massRandom() {
        Random generator = new Random();
        int k = 0;
        int[] randomMath = new int[15];
        for (int i = 0; i < randomMath.length; i++) {
            randomMath[i] = generator.nextInt(10);
            System.out.print(randomMath[i] + " ");
            if (randomMath[i] % 2 == 0) {
                k++;
            }
        }
        System.out.println();
        System.out.println("Count of even-numbered = " + k);
    }

    //Создайте массив из 15 случайных целых чисел из отрезка [0;999]. Выведите массив на экран.
    // Выведите минимальное и максимальное значение элементов массива
    public static void masMaxMinRandom() {
        int max = 0;
        int min = 0;
        Random generator = new Random();
        int[] randomMath = new int[15];
        for (int i = 0; i < randomMath.length; i++) {
            randomMath[i] = generator.nextInt(1000);
            if (i == 0)
                min = randomMath[i];
            if (min > randomMath[i]) {
                min = randomMath[i];
            } else if (max < randomMath[i]) {
                max = randomMath[i];
            }
            System.out.print(randomMath[i] + " ");
        }
        System.out.println();
        System.out.println("return min = " + min + " return max =" + max);

    }
    //Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
    // Вывести массив на экран.


    public static void main(String[] args) {
        // arrayEvenNumbers();
        //arrayEvenNumbersCreate();
        // massEven();
        //massNotEven();
        //massRandom();
        masMaxMinRandom();
    }

}

