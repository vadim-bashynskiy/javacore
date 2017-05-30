package com.bashynskiy.runners.classwork.lesson20;

import com.bashynskiy.app.classwork.lesson20.Compare;
import com.bashynskiy.app.classwork.lesson20.CompareData;
import com.bashynskiy.app.classwork.lesson20.OrderUtil;

/**
 * Created by testu on 5/30/2017.
 */
public class CompareDataRunner {
    public static void main(String[] args) {
        Compare<Integer> compare = new CompareData<>(10);
        Compare<Integer> compare1 = new CompareData<>(10);
        System.out.println(OrderUtil.compare(compare,compare1));

    }
}
