package com.bashynskiy.app.classwork.lesson20;

/**
 * Created by testu on 5/30/2017.
 */
public class CompareData<K> implements Compare {
    private K Key;

    public CompareData(K key) {
        Key = key;
    }

    @Override
    public K getKey() {
        return Key;
    }
}
