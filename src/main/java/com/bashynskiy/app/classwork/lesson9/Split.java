package com.bashynskiy.app.classwork.lesson9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by admin on 10.04.2017.
 */
public class Split {
    public void StringSplit(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] mass = input.split(" ");
        for (int i = 0; i < mass.length; i++) {
            String a = mass[i];
            System.out.println();
            for (int j = 0; j < a.length() ; j++) {
                System.out.print(a.charAt(j));
            }
        }

    }
}
