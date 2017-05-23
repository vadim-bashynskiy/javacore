package com.bashynskiy.runners.classwork.lesson18;


import java.util.ArrayList;

/**
 * Created by testu on 5/23/2017.
 */
public class CollectionRunner {
    public static void main(String[] args) {
        String bmv = "BMW";
        String audi = "audi";
        int a = 23;
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList.add(bmv);
        arrayList.add(audi);
        arrayList1.add("BMW");
        arrayList1.add("audi");
        System.out.println(arrayList);
        System.out.println(arrayList.contains(audi));
        arrayList.remove(audi);
        arrayList.remove(0);
        arrayList.isEmpty();
        arrayList.add(String.valueOf(a));
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.indexOf(String.valueOf(a)));
        arrayList.removeAll(arrayList);
        System.out.println(arrayList.containsAll(arrayList1));

        int number = 5; // автобоксинг
        Integer number1 = 5;//literal // попадает в инт пулов под которого не выделяется память
        Integer numberTwo = new Integer(6);
        int unboxing = numberTwo;
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(new Integer(number));// or like
        integerArrayList.add(number);



    }
}
