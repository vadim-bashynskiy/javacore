package com.bashynskiy.app.classwork.lesson12;

/**
 * Created by testu on 4/25/2017.
 */
public class Student extends Person {
    private int age;
    private int stayUniver = 5;
    public Student(String name, String university, int age) {
        super(name, university, age);
    }


    public void printStudentInfo() {
        System.out.println("Student info: " + getName()
                +  " university:" + " age: " + getAge());
    }
    @Override
    public void stayUniversity(){

        System.out.println("Stay univer = " + getStayUniver());
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getStayUniver() {
        return stayUniver;
    }

    @Override
    public void setStayUniver(int stayUniver) {
        this.stayUniver = stayUniver;
    }
}
