package com.bashynskiy.app.classwork.lesson8;

import java.util.Random;

/**
 * Created by testu on 3/31/2017.
 */
public class SortArray {

    public void sortBobl(int random , int countMass){
        Random generator = new Random();
        int[] sortBouble = new int[countMass];
        for (int i = 0; i < sortBouble.length; i++) {
            sortBouble[i]=generator.nextInt(random);
        }
        //sort bouble
        for (int i = 0; i < sortBouble.length; i++) {
            for (int j = 0; j < sortBouble.length-1; j++) {
                if (sortBouble[j] > sortBouble[j+1]){
                    int temp = sortBouble[j+1];
                    sortBouble[j+1] = sortBouble[j];
                    sortBouble[j] = temp;
                }
            }
        }
        //print
        for (int element:sortBouble
             ) {
            System.out.print(element + " ");

        }
    }
}
