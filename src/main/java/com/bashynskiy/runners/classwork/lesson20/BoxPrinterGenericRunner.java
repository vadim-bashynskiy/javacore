package com.bashynskiy.runners.classwork.lesson20;

import com.bashynskiy.app.classwork.lesson20.BoxPrinter;
import com.bashynskiy.app.classwork.lesson20.BoxPrinterGeneric;

/**
 * Created by testu on 5/30/2017.
 */
public class BoxPrinterGenericRunner {
    public static void main(String[] args) {
        BoxPrinterGeneric<Integer> boxPrinter = new BoxPrinterGeneric<>(10);
        System.out.println(boxPrinter);
        Integer integer = boxPrinter.getVal();
        System.out.println(integer);
        BoxPrinterGeneric<String> boxPrinter1 = new BoxPrinterGeneric<>("Hello World");
        System.out.println(boxPrinter1);
        // compile error
        // Integer integer1 = (Integer)boxPrinter1.getVal();
        String string = boxPrinter1.getVal();

        BoxPrinterGeneric<Long> boxPrinterLong = new BoxPrinterGeneric<>(1000l);
        System.out.println(boxPrinterLong);

    }
}
