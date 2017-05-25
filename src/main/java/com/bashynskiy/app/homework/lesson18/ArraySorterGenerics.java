package com.bashynskiy.app.homework.lesson18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by VBashynskyi on 25.05.2017.
 */
public class ArraySorterGenerics <T extends Number> {
    private T[] mass;

    public ArraySorterGenerics(T[] mass) {
        this.mass = mass;
    }

    public void sort(){
        Arrays.sort(mass);
    }

    public T[] getMass() {
        return mass;
    }
    public static <K> K[] massSort(K[] massive){
        Arrays.sort(massive);
        return massive;
    }

}
