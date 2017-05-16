package com.bashynskiy.runners.homework.lesson15;

import com.bashynskiy.app.homework.lesson15.Flat;
import com.bashynskiy.app.homework.lesson15.House;

/**
 * Created by testu on 5/16/2017.
 */
public class HomeRunner {
    public static void main(String[] args) {
        String tvName = "23";
        String dishes = "all instruments";
        Flat flat = new Flat(dishes);
        flat.setTvName(tvName);
        House house = new House(flat);
        System.out.println("Flat number = " + house.getFlat().getTvName() + " Instruments = " + house.getFlat().getDishes());
    }
}
