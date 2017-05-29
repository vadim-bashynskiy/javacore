package com.bashynskiy.app.homework.lesson19;

import java.util.ArrayList;

/**
 * Created by VBashynskyi on 26.05.2017.
 */
public class Category {
   public static ArrayList<String> categoryList = new ArrayList<>();

    public void addCategoryList(String nameCategory) {
        if (categoryList.contains(nameCategory)){
            System.out.println("We already have this category");
        }
        categoryList.add(nameCategory);
    }

    public void printCategoryList() {
        if (categoryList.isEmpty()){
            System.out.println("Category list are empty");
        }
        for (String cate: categoryList) {
            System.out.println(cate);
        }
    }

}
