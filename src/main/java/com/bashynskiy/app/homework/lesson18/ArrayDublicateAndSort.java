package com.bashynskiy.app.homework.lesson18;

import java.util.*;

/**
 * Created by admin on 25.05.2017.
 */

/*Написать класс который
        считывает набор слов с клавиатуры - каждое слово разделяется новой строкой (Enter).
        Если был ввод пустой строки - программа прекращает считывание строк с клавиатуры,
        убирает дубликаты строк (если они есть) и
        сортирует список строк в алфавитном порядке, после чего
        выводит на экран список строк в столбик.*/

public class ArrayDublicateAndSort {
    private ArrayList<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void inputList() {
        while (true) {
            String nextLine = scanner.nextLine();
            if (nextLine.equals("")) {
                System.out.println("Input data are finished");
                break;
            } else {
                list.add(nextLine);
            }
        }
    }

    public ArrayList removeDublicate() {
        inputList();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equalsIgnoreCase(list.get(j))) {
                    list.remove(j);
                }
            }
        }
        list.sort(String::compareTo);
        return list;
    }

    public HashSet removeDubAndSort() {
        inputList();
        HashSet hashSet = new HashSet();
        list.sort(String::compareTo);
        hashSet.addAll(list);
        return hashSet;
    }

    public void print() {
        removeDublicate();
        for (String element : list) {
            System.out.println(element);
        }
    }
}
