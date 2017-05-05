package com.bashynskiy.runners.homework.lesson14;

import com.bashynskiy.app.homework.lesson14.Bouquet;

/**
 * Created by testu on 5/5/2017.
 */
public class BouquetRunner {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        System.out.println("Your bouquet price = " + bouquet.count(bouquet.flowersMass()));
    }

}
