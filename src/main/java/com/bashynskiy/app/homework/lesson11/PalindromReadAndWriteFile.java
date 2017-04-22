package com.bashynskiy.app.homework.lesson11;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by admin on 22.04.2017.
 */
//Реализовать программу, которая считывает из файла список слов в стобик,
// и выводит в другой файл список слов и признак полиндромности в виде “moom is polindrome”.
public class PalindromReadAndWriteFile {
    public void readerAndWritePalindrom() {
       System.out.println("Palindrome worlds with new file : ");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\javacore\\src\\test\\resources\\worlds.txt"));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\javacore\\src\\test\\resources\\worldsPolindrom.txt")));
            String line;
            while ((line = reader.readLine()) != null) {
                StringBuilder stringBuilder = new StringBuilder(line);
                String[] mass = stringBuilder.toString().split(" ");
                for (int i = 0; i < mass.length; i++) {
                    if (mass[i].equals((new StringBuilder(mass[i])).reverse().toString())){
                     mass[i] += " is polindrome";
                    }
                    writer.append(mass[i]+ "\n");
                    System.out.println(mass[i]);
                }
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
