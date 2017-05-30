package com.bashynskiy.runners.classwork.lesson20;

import com.bashynskiy.app.classwork.lesson20.OrderPair;
import com.bashynskiy.app.classwork.lesson20.OrderUtil;
import com.bashynskiy.app.classwork.lesson20.Pair;

/**
 * Created by testu on 5/30/2017.
 */
public class OrderRunner {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderPair<>("Even", 8);
        Pair<String, Integer> p2 = new OrderPair<>("Odd", 11);
        boolean same = OrderUtil.compare(p1, p2);
        System.out.println(same);
        Pair<String, Integer> p3 = new OrderPair<>("bla", 43);
        String key = p1.getKey();


    }
}
