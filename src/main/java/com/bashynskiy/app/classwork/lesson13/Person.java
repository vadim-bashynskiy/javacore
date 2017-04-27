package com.bashynskiy.app.classwork.lesson13;

/**
 * Created by testu on 4/25/2017.
 */
public class Person {
    // проьектед будет работать толь если обьекты находятся в одном пакете
    protected String name;
    public String university;
    public int age;
    public int stayUniver = 5;

    public Person(String name,String university,int age) {
        this.name = name;
        this.university = university;
        this.age = age;
    }
    protected void printPersonInfo(){
        System.out.println("print person info: " + name);
    }
    public void stayUniversity(){

        System.out.println("Stay univer = " + stayUniver);
    }
}
