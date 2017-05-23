package com.bashynskiy.runners.classwork.lesson18;

import java.util.LinkedList;

/**
 * Created by testu on 5/23/2017.
 */
public class LInkedListRunner {
    public static void main(String[] args) {
        String bmv = "BMW";
        String audi = "audi";
        String reno = "reno";
        String subaro = "subaro";
        // работает цепочкой содержится списком ссылок на обьекты
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add(bmv);
        linkedList.add(audi);
        linkedList.add(reno);
        linkedList.add(subaro);
        linkedList.remove(audi);
        System.out.println(linkedList);
    }
}
