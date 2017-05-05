package com.bashynskiy.runners.classwork.lesson15;

import com.bashynskiy.app.classwork.lesson15.AbstractHouse;
import com.bashynskiy.app.classwork.lesson15.Chicago;
import com.bashynskiy.app.classwork.lesson15.OsokorkiHouse;

/**
 * Created by testu on 5/5/2017.
 */
public class AbstractRunner {
    public static void main(String[] args) {
        AbstractHouse chicago = new Chicago("Chikago");
        AbstractHouse osokorkiHouse = new OsokorkiHouse("Osokorki");
        osokorkiHouse.showHouseNumber("16");
        chicago.showHouseNumber("144a");
    }
}
