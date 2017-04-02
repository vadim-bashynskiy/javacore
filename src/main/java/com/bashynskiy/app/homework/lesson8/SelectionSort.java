package com.bashynskiy.app.homework.lesson8;

import java.util.Random;

/**
 * Created by admin on 02.04.2017.
 */
public class SelectionSort {
    //** Выполнить сортировку массива методом Selection sort
    public int[] selectSort(int randomElements, int lengthMass) {
        Random generator = new Random();
        int[] sortSelectMass = new int[lengthMass];
        for (int i = 0; i < sortSelectMass.length; i++) {
            sortSelectMass[i] = generator.nextInt(randomElements);
        }
        System.out.print("inputMassElementSelectSort = ");
        for (int inputMassElementMaxToMin : sortSelectMass) {
            System.out.print(inputMassElementMaxToMin + " ");
        }
        System.out.println();

        for (int i = 0; i < sortSelectMass.length - 1; i++) {
    /* устанавливаем начальное значение минимального индекса */
            int min = i;
        /* находим индекс минимального элемента */
            for (int j = i + 1; j < sortSelectMass.length; j++) {
                if (sortSelectMass[j] < sortSelectMass[min]) {
                    min = j;
                }
            }
                    /* меняем значения местами */
            int temp = sortSelectMass[i];
            sortSelectMass[i] = sortSelectMass[min];
            sortSelectMass[min] = temp;
        }
        return sortSelectMass;
    }
}
