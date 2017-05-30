package com.bashynskiy.app.classwork.lesson20;

/**
 * Created by testu on 5/30/2017.
 */
public class OrderPair<K, V> implements Pair {
    private K key;
    private V value;

    public OrderPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
