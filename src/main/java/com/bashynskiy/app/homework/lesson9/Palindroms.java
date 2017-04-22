package com.bashynskiy.app.homework.lesson9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by testu on 4/11/2017.
 */
public class Palindroms {
    public void polindromFirstVariant() {
        System.out.println("Please enter string");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        char[] mass = input.toCharArray();
        char[] mass1 = new char[mass.length];
        for (int i = 1; i <= mass.length; i++) {
            mass1[i-1] = mass[mass.length - i];
        }
        System.out.println(Arrays.toString(mass));
        System.out.println(Arrays.toString(mass1));
        if (Arrays.equals(mass, mass1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
    public void palindromSecondVariant(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string");
        String input = scanner.nextLine();
        String revert = new StringBuffer(input).reverse().toString();
        if (input.equalsIgnoreCase(revert)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
    public void palindromThirdVariant(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string");
        String input = scanner.nextLine();
        String revert = new StringBuffer(input).reverse().toString();
        if (input.hashCode()==revert.hashCode()){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
