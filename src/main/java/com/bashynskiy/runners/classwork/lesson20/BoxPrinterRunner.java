package com.bashynskiy.runners.classwork.lesson20;

import com.bashynskiy.app.classwork.lesson20.BoxPrinter;

/**
 * Created by testu on 5/30/2017.
 */
public class BoxPrinterRunner {
    public static void main(String[] args) {
        BoxPrinter boxPrinter = new BoxPrinter(new Integer(10));
        System.out.println(boxPrinter);
        Integer integer = (Integer)boxPrinter.getVal();
        System.out.println(integer);
        BoxPrinter boxPrinter1 = new BoxPrinter(new String("Hello World"));
        System.out.println(boxPrinter1);
       // Integer integer1 = (Integer)boxPrinter1.getVal();
       // System.out.println(integer1);

    }
}
