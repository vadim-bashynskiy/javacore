package com.bashynskiy.runners.homework.lesson18;

import com.bashynskiy.app.homework.lesson18.ArraySorterGenerics;

import java.util.Arrays;

/**
 * Created by admin on 25.05.2017.
 */
public class ArraySorterGenericsRunner {
    public static void main(String[] args) {
        ArraySorterGenerics<Integer> arraySorterGenerics = new ArraySorterGenerics<>(new Integer[]{10,47,12,54,2,176,13,18,1,2});
        arraySorterGenerics.sort();
        System.out.println(Arrays.asList(arraySorterGenerics.getMass()));
        System.out.println(Arrays.asList(ArraySorterGenerics.massSort(new String[]{"fgsdf","adsfs","adcfg","bdfg","176"})));
    }
}
