package com.bashynskiy.app.homework.lesson19;

import java.util.ArrayList;

/**
 * Created by VBashynskyi on 26.05.2017.
 */
public class Category {
    ArrayList<String> categoryList = new ArrayList<>();

    public void addCategoryList(String nameCategory){
        categoryList.add(nameCategory);
    }
}
