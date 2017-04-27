package com.bashynskiy.app.classwork.lesson13;

/**
 * Created by testu on 4/25/2017.
 */
public class Student extends Person {
    public int age;
    int stayUniver = 5;
    public Student(String name, String university, int age) {
        super(name, university, age);
    }


    public void printStudentInfo() {
        System.out.println("Student info: " + name
                +  " university:" + " age: " + age);
    }
    @Override
    public void stayUniversity(){

        System.out.println("Stay univer = " + stayUniver);
    }
}
