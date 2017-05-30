package com.bashynskiy.app.classwork.lesson20;

/**
 * Created by testu on 5/30/2017.
 */
public class BoxPrinterGeneric<T> {
    private T val;

    public BoxPrinterGeneric(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "{" +
                "val=" + val +
                '}';
    }
}
