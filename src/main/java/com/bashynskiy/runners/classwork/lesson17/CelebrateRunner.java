package com.bashynskiy.runners.classwork.lesson17;

import com.bashynskiy.app.classwork.lesson17.Celebrate;

/**
 * Created by testu on 5/16/2017.
 */
public class CelebrateRunner {
    public static void main(String[] args) {
        for (Celebrate cCelebrate: Celebrate.values()) {
            System.out.println(cCelebrate.getDescription() +
                    " is on " + cCelebrate.getMonth() + " " + cCelebrate.getNumber());
        }
    }
}
