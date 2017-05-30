package com.bashynskiy.app.classwork.lesson20;

/**
 * Created by testu on 5/30/2017.
 */
public class Box<T extends Number> {
    private T t;

    public Box(T t) {
        this.t = t;
    }

    public <U extends Pair> U inspect(U u) {
        System.out.println(u.getKey());
        return u;
    }
}
