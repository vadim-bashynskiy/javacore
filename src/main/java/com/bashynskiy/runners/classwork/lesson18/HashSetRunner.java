package com.bashynskiy.runners.classwork.lesson18;

import java.util.HashSet;

/**
 * Created by testu on 5/23/2017.
 */
public class HashSetRunner {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        String audi = "audi";
        String bmv = "bmv";
        hashSet.add(bmv);
        hashSet.add(audi);
        hashSet.add("c");
        hashSet.add(bmv);
        hashSet.add("a");
        hashSet.add(23);
        hashSet.add(23);
        hashSet.add("c");
        System.out.println(hashSet);
    }
}
