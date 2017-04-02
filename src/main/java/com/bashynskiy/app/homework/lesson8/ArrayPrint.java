package com.bashynskiy.app.homework.lesson8;

import java.util.Arrays;

/**
 * Created by admin on 02.04.2017.
 */
public class ArrayPrint {
    public void output(int randomInputElements, int lengthMass) {
        SortBubbleMas sortBubbleMas = new SortBubbleMas();
        SelectionSort selectionSort = new SelectionSort();
        MassDoubleMax massDoubleMax = new MassDoubleMax();
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.print("Sort array minToMax = " + Arrays.toString(sortBubbleMas.sortBubbleMintoMax(randomInputElements, lengthMass)));
        System.out.println();
        System.out.println("__________________________________________________________________________________________________________");
        System.out.print("Sort array maxToMin = " + Arrays.toString(sortBubbleMas.sortBubbleMaxToMin(randomInputElements, lengthMass)));
        System.out.println();
        System.out.println("__________________________________________________________________________________________________________");
        System.out.println("Sort array by selection sort = " + Arrays.toString(selectionSort.selectSort(randomInputElements, lengthMass)));
        System.out.println("__________________________________________________________________________________________________________");
        massDoubleMax.massDouble();
        System.out.println("__________________________________________________________________________________________________________");
        multiplicationTable.multiplication();

    }
}
