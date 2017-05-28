package com.bashynskiy.runners.classwork.lesson19;


import com.bashynskiy.app.classwork.lesson19.TrainingCenter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by testu on 5/26/2017.
 */
public class TrainingCenterRunner {
    public static void main(String[] args) {
        TrainingCenter trainingCenter = new TrainingCenter();
        trainingCenter.name = "KIt";
        TrainingCenter bio = new TrainingCenter();
        bio.name = "BIO";
        TrainingCenter rio = new TrainingCenter();
        TrainingCenter kia = new TrainingCenter();
        rio.name = "RIO";
        kia.name = "KIA";

        Map<TrainingCenter, Integer> map = new HashMap(32);
        map.put(trainingCenter,13);
        map.put(bio,13);
        map.put(kia,15);
        map.put(rio,22);
        System.out.println(map.entrySet());
        for (Map.Entry<TrainingCenter, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
