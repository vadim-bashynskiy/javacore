package com.bashynskiy.app.classwork.lesson20;

/**
 * Created by testu on 5/30/2017.
 */
public class BoxPrinter {
    private Object val;

    public BoxPrinter(Object val) {
        this.val = val;
    }

    public Object getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "{" +
                "val=" + val +
                '}';
    }
}
