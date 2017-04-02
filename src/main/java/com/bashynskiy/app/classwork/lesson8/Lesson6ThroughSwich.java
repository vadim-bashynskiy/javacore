package com.bashynskiy.app.classwork.lesson8;

import com.bashynskiy.app.homework.lesson6.ArrayNumbers;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by testu on 3/31/2017.
 */
public class Lesson6ThroughSwich {


    public int hendlerMenuSwich() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        int selectedMenu;
        do {
            try {
                selectedMenu = scanner.nextInt();
                if (selectedMenu < 1 || selectedMenu > 8) {
                    System.out.println("Please input a number between 1-8.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please input a number between 1-8.");
                scanner.nextLine();
                selectedMenu = 0;
            }

        } while (selectedMenu < 1 || selectedMenu > 8);

        return selectedMenu;
    }
    public void swichCase(){
        ArrayNumbers arrayNumbers = new ArrayNumbers();
       int option = hendlerMenuSwich();
        switch (option){
            case 1:
                arrayNumbers.arrayEvenNumbers();
                break;
            case 2:
                arrayNumbers.arrayEvenNumbersCreate();
                break;
            case 3:
                arrayNumbers.massEven();
                break;
            case 4:
                arrayNumbers.massNotEven();
                break;
            case 5:
                arrayNumbers.massRandom();
                break;
            case 6:
                arrayNumbers.masMaxMinRandom();
                break;
            case 7:
                arrayNumbers.massDoubleLevel();
                break;
            case 8:
                arrayNumbers.scannerInput();
                break;
        }
    }
}


