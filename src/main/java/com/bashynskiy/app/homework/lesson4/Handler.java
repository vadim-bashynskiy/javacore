package com.bashynskiy.app.homework.lesson4;

import com.bashynskiy.app.classwork.lesson3.MathFunc;
import com.bashynskiy.app.classwork.lesson4.CircleArea;
import com.bashynskiy.app.utils.convertors.PrimitiveConvertor;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by testu on 3/19/2017.
 */
public class Handler {
    static DecimalFormat decimalFormat = new DecimalFormat();

    public static int hendlerMenu() throws InputMismatchException {
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

    public static double hendleDoubleVariable() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String nextLine = scanner.nextLine();

            try {
                double radius = Double.parseDouble(nextLine);
                return radius;
            } catch (NumberFormatException e) {
                System.out.println("Input incorrect value, try again");
            }
        }


    }

    public static float hendleFloatVariable() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String nextLine = scanner.nextLine();
            try {
                float variable = Float.parseFloat(nextLine);
                return variable;
            } catch (NumberFormatException e) {
                System.out.println("Input incorrect value, try again");
            }
        }
    }

    public static char hendleCharVariable() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String nextLine = scanner.nextLine();
            try {
                if (nextLine.length() == 1) {
                    return nextLine.charAt(0);
                } else {
                    System.out.println("Please input only one symbol");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input incorrect value, try again");
            }
        }
    }

    public static int hendleIntVariable() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String nextLine = scanner.nextLine();
            try {
                int variable = Integer.parseInt(nextLine);
                return variable;
            } catch (NumberFormatException e) {
                System.out.println("Input incorrect value, try again");
            }
        }
    }


    public static void runHendler() {

        int option = hendlerMenu();
        switch (option) {
            case 1:
                System.out.println("Please input radius");
                System.out.println("Circle Area = " + decimalFormat.format(CircleArea.calculateCircleArea(hendleDoubleVariable())));
                System.out.println();
                PrintMenu.printMenu();
                break;

            case 2:
                System.out.println("Please input first number");
                double a = hendleDoubleVariable();
                System.out.println("Please input second number");
                double b = hendleDoubleVariable();
                System.out.println("Max equals = " + CircleArea.calculateBigger(a, b));
                PrintMenu.printMenu();
                break;

            case 3:
                System.out.println("Please input first number");
                a = hendleDoubleVariable();
                System.out.println("Please input second number");
                b = hendleDoubleVariable();
                System.out.println("Sum = " + MathFunc.sum(a, b));
                System.out.println();
                PrintMenu.printMenu();
                break;
            case 4:
                System.out.println("Please input first number");
                a = hendleDoubleVariable();
                System.out.println("Please input second number");
                b = hendleDoubleVariable();
                System.out.println("multiply = " + MathFunc.multiply(a, b));
                System.out.println();
                PrintMenu.printMenu();
                break;
            case 5:
                System.out.println("Please input value");
                System.out.println("Char = " + PrimitiveConvertor.floatToChar(hendleFloatVariable()));
                PrintMenu.printMenu();
                break;
            case 6:
                System.out.println("Please input value");
                System.out.println("Int = " + PrimitiveConvertor.charToInt(hendleCharVariable()));
                PrintMenu.printMenu();
                break;

            case 7:
                System.out.println("Please input value");
                System.out.println("Char = " + PrimitiveConvertor.intToChar(hendleIntVariable()));
                PrintMenu.printMenu();

            case 8:
                break;

        }
    }
}
