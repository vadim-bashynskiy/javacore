package com.bashynskiy.app.classwork.lesson12;

/**
 * Created by testu on 4/25/2017.
 */
public class Person {
    // проьектед будет работать толь если обьекты находятся в одном пакете
    private String name;
    private String university;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStayUniver() {
        return stayUniver;
    }

    public void setStayUniver(int stayUniver) {
        this.stayUniver = stayUniver;
    }

    private int stayUniver = 5;

    public Person(String name,String university,int age) {
        this.name = name;
        this.university = university;
        this.age = age;
    }
    protected void printPersonInfo(){
        System.out.println("print person info: " + getName());
    }
    public void stayUniversity(){

        System.out.println("Stay univer = " + getStayUniver());
    }
}
