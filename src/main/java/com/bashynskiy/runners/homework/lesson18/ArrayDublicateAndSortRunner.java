package com.bashynskiy.runners.homework.lesson18;

import com.bashynskiy.app.homework.lesson18.ArrayDublicateAndSort;

/**
 * Created by admin on 25.05.2017.
 */
public class ArrayDublicateAndSortRunner {
    public static void main(String[] args) {
        ArrayDublicateAndSort arrayDublicateAndSort = new ArrayDublicateAndSort();
        //remove dublicate and sort with ArrayList and my func
        arrayDublicateAndSort.print();
        //remove dublicate and sort with help TreeSet
        System.out.println(arrayDublicateAndSort.removeDubAndSort());
    }
}
