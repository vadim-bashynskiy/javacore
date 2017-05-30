package com.bashynskiy.runners.classwork.lesson20;

import com.bashynskiy.app.classwork.lesson20.Box;
import com.bashynskiy.app.classwork.lesson20.OrderPair;
import com.bashynskiy.app.classwork.lesson20.Pair;

/**
 * Created by testu on 5/30/2017.
 */
public class BoxRunner {
    public static void main(String[] args) {
        //Box<String> numberBox = new Box<>("10"); compile error
        Box<Integer> integerBox = new Box<>(10);
        Pair<String, Integer> p2 = new OrderPair<>("Odd", 11);
        integerBox.inspect(p2);
        //integerBox.inspect(new Integer(10)); compile error incompetible tipes
        //нужно передавать обьект которые екстендит интерфейс Pair
    }
}
