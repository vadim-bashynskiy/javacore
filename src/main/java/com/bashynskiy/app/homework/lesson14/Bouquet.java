package com.bashynskiy.app.homework.lesson14;

import java.util.Scanner;

/**
 * Created by admin on 04.05.2017.
 */
public class Bouquet {
    double bouquetMoney;
    public double howMuch(double flower, int count){
        return bouquetMoney += flower * count;
    }

    public double count(Flower[] flowers){
        Scanner scanner = new Scanner(System.in);
        for (Flower flower: flowers) {
            System.out.println("How much " +flower.nameFlower() + " you want to add to bouquet");
            howMuch(flower.price(),scanner.nextInt());
        }
        return bouquetMoney;
    }
    public Flower[] flowersMass(){
        Flower rose = new Rose();
        Flower carnation = new Carnation();
        Flower tulip = new Tulip();
        Flower[] flowers = new Flower[3];
        flowers[0] = rose;
        flowers[1] = carnation;
        flowers[2] = tulip;
        return flowers;
    }

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        System.out.println("Your bouquet price = " + bouquet.count(bouquet.flowersMass()));
    }
}
