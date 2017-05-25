package com.bashynskiy.runners.classwork.lesson18;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by testu on 5/23/2017.
 */
public class MapRunner {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        String niko = "niko";
        m1.put("Zara", "8");
        m1.put("Mahnaz", 31);
        m1.put("Ayan", "12");
        m1.put("Daisy", 14);
        m1.put(niko,144);
        System.out.println(m1.get("Zara"));
        System.out.println(m1.get("Mahnaz"));
        System.out.println(m1.get("Ayan"));
        System.out.println(m1.get("daisy"));
        System.out.println(m1.get(niko));
        System.out.println("Map Elements");
        System.out.println("\t" + m1);
    }
}
