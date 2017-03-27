package com.bashynskiy.app.homework.lesson6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by admin on 24.03.2017.
 */
public class ArrayNumbers {
    public void arrayEvenNumbers() {
        System.out.println("Exercises 1");
        int[] evenList = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < evenList.length; i++) {
            System.out.print(evenList[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < evenList.length; j++) {
            System.out.println(evenList[j] + " ");
        }

    }

    public void arrayEvenNumbersCreate() {
        System.out.println("Exercises 1");
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

    public void massEven() {
        System.out.println("Exercises 1");
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

    public void massNotEven() {
        System.out.println("Exercises 2");
        int max = 99;
        int[] mass = new int[max / 2 + 1];
        for (int i = 0; i < mass.length; i++) {
            System.out.print((mass[i] = i * 2 + 1) + " ");
        }
        System.out.println();
        for (int i = mass.length - 1; i > -1; i--) {
            System.out.print((mass[i] = i * 2 + 1) + " ");
        }
        System.out.println();
    }

    //Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
    // Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
    public void massRandom() {
        System.out.println("Exercises 3");
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
    public void masMaxMinRandom() {
        System.out.println("Exercises 4");
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
    public void massDoubleLevel() {
        System.out.println("Exercises 5");
        Random generator = new Random();
        int[][] mathSecond = new int[8][5]; // объявили двухмерный массив
        int i, j, k = 0;

        for (i = 0; i < 8; i++) {
            System.out.println();
            for (j = 0; j < 5; j++) {
                int a = 0;
                while (a < 10)
                    a = generator.nextInt(999);
                if (a >= 10)
                    mathSecond[i][j] = a;
                if (a < 100) {
                    System.out.print(" " + mathSecond[i][j] + " ");
                } else {
                    System.out.print(mathSecond[i][j] + " ");
                }
            }

        }
        System.out.println();
    }
    //  *** Запросить у пользователя ввести ряд чисел c вводом по одному через Enter
    // (запрашиваем число - ввел число - Enter - запрашиваем следующее).
    // Ввод должен прерываться словом “exit”, о чем нужно сообщить
    // пользователю (если пользователь ввел “exit” - больше не запрашиваем числа).
    // После прерывания ввода - вывести сумму всех введенных пользователем чисел.

    public void scannerInput() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Input numbers through enter");
        System.out.println("If you entered 'exit' = program will be finished");
        String exit = "exit";
        while (true) {
            String nextLine = scanner.nextLine();
            if (nextLine.equals(exit)) {
                int sum = 0;
                for (int i = 0; i < list.size(); i++) {
                    sum = sum + list.get(i);
                }
                System.out.println("Sum = " + sum);
                break;
            } else {

                try {
                    int variable = Integer.parseInt(nextLine);
                    list.add(variable);

                } catch (NumberFormatException f) {
                    System.out.println("Input incorrect value, enter only numbers or 'exit'");
                }

            }
        }
    }
}

