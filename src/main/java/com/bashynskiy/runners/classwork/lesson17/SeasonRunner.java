package com.bashynskiy.runners.classwork.lesson17;

import com.bashynskiy.app.classwork.lesson17.Season;

import java.util.Arrays;

/**
 * Created by testu on 5/16/2017.
 */
public class SeasonRunner {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        if (season == Season.SPRING){
            season = Season.SUMMER;
        }
        System.out.println(season.name());
        Season season1 = Season.valueOf("SPRING");
        System.out.println(Arrays.toString(Season.values()));
    }
}
