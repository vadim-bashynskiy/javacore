package com.bashynskiy.app.homework.lesson8;

import java.util.Random;

/**
 * Created by admin on 02.04.2017.
 */
//Написать класс для пузырьковой сортировки с 2 методами, которые будут на входе
// при вызове принимать одномерный массив int. Один метод должен сортировать от меньшего числа к
// большему, второй - наоборот. Методы должны возвращать также одномерный массив int.
// Входной и результирующий массивы вывести классом ArrayPrint (который вы создадите для вывода массивов)
// результат выводится на экран раннером.

public class SortBubbleMas {
    public int[] sortBubbleMintoMax(int random, int countMass) {
        Random generator = new Random();
        int[] sortBoubleMin = new int[countMass];
        for (int i = 0; i < sortBoubleMin.length; i++) {
            sortBoubleMin[i] = generator.nextInt(random);
        }
        System.out.print("inputMassElementMinToMax = ");
        for (int inputMassElementMinToMax : sortBoubleMin) {
            System.out.print(inputMassElementMinToMax + " ");
        }
        System.out.println();
        //sort bouble
        for (int i = 0; i < sortBoubleMin.length; i++) {
            for (int j = 0; j < sortBoubleMin.length - 1; j++) {
                if (sortBoubleMin[j] > sortBoubleMin[j + 1]) {
                    int temp = sortBoubleMin[j + 1];
                    sortBoubleMin[j + 1] = sortBoubleMin[j];
                    sortBoubleMin[j] = temp;
                }
            }
        }
        return sortBoubleMin;
    }


    public int[] sortBubbleMaxToMin(int randomElements, int countMass) {
        Random generator = new Random();
        int[] sortBoubleMax = new int[countMass];
        for (int i = 0; i < sortBoubleMax.length; i++) {
            sortBoubleMax[i] = generator.nextInt(randomElements);
        }
        System.out.print("inputMassElementMaxToMin = ");
        for (int inputMassElementMaxToMin : sortBoubleMax) {
            System.out.print(inputMassElementMaxToMin + " ");
        }
        System.out.println();
        //sort bouble
        for (int i = 0; i < sortBoubleMax.length; i++) {
            for (int j = 0; j < sortBoubleMax.length - 1; j++) {
                if (sortBoubleMax[j] < sortBoubleMax[j + 1]) {
                    int temp = sortBoubleMax[j + 1];
                    sortBoubleMax[j + 1] = sortBoubleMax[j];
                    sortBoubleMax[j] = temp;
                }
            }
        }
        return sortBoubleMax;
    }

}

