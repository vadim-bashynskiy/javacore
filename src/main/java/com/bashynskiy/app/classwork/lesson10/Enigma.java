package com.bashynskiy.app.classwork.lesson10;

import java.util.Scanner;

/**
 * Created by testu on 4/11/2017.
 */
public class Enigma {
    public String encode(){
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine().toLowerCase();
        String text = "abcd";
        String codeText = "qgfe";
        StringBuilder stringBuilder = new StringBuilder(password);

        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < codeText.length(); j++) {
                if (stringBuilder.charAt(i)== text.charAt(j)){
                    stringBuilder.setCharAt(i,codeText.charAt(j));
                }
            }
        }
        return stringBuilder.toString();

    }

    public String decode(){
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine().toLowerCase();
        String text = "abcd";
        String passwordText = "qgfe";
        StringBuilder stringBuilder = new StringBuilder(password);
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < passwordText.length(); j++) {
                if (stringBuilder.charAt(i)== passwordText.charAt(j)){
                    stringBuilder.setCharAt(i,text.charAt(j));
                }
            }
        }
        return stringBuilder.toString();
    }
}
