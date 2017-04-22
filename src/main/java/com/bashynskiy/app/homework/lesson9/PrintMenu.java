package com.bashynskiy.app.homework.lesson9;

import java.util.Scanner;

/**
 * Created by testu on 4/11/2017.
 */
public class PrintMenu {
    public void print() {
        System.out.println("input 1 for Palindrome exercises1");
        System.out.println("input 2 for Palindrome exercises2");
        System.out.println("input 3 for Palindrome exercises3");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        Palindroms palindroms = new Palindroms();
        switch (option) {
            case 1:
                palindroms.polindromFirstVariant();
                break;
            case 2:
                palindroms.palindromSecondVariant();
                break;
            case 3:
                palindroms.palindromThirdVariant();
                break;
            case 4:
                System.out.println("Sorry bat we don't have these exercises");
                break;
        }
    }
}
