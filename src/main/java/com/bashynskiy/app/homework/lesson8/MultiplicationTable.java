package com.bashynskiy.app.homework.lesson8;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by admin on 02.04.2017.
 */
public class MultiplicationTable {
    public void multiplication() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int[][] massiv = new int[15][3];
        for (int x = 0; x < massiv.length; x++) {
            massiv[x][0] = (int) (Math.random() * 8 + 2);
            massiv[x][1] = (int) (Math.random() * 8 + 2);
            for (int i = 0; i < x; i++) {
                if (massiv[x][0] == massiv[i][0] & massiv[x][1] == massiv[i][1] || massiv[x][0] == massiv[i][1] & massiv[x][1] == massiv[i][0]) {
                    massiv[x][0] = (int) (Math.random() * 8 + 2);
                    massiv[x][1] = (int) (Math.random() * 8 + 2);
                    i = 0;
                }
            }
            massiv[x][2] = (massiv[x][0]) * (massiv[x][1]);

        }
        System.out.println("Please input answer:");

        for (int x = 0; x < massiv.length; x++) {

            System.out.print("Exercise №" + (x + 1) + ":\t\t" + massiv[x][0] + " * " + massiv[x][1] + " = ");
            int answer;
            do {
                try {
                    answer = scanner.nextInt();
                    if (answer == (massiv[x][2])) {
                        count++;
                        System.out.println("Great it's right answered");
                    } else {
                        System.out.println("Wrong answer");
                        System.out.println("Correct answer = " + "\t" + massiv[x][0] + " * " + massiv[x][1] + " = " + massiv[x][2]);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Incorrect input");
                    scanner.nextLine();
                    answer = 0;
                    x--;
                }
            } while (answer < 0);

        }
        System.out.println("Congrats you answered right for = " + count + " exercises");
    }

}