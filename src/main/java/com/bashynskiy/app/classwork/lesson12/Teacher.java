package com.bashynskiy.app.classwork.lesson12;

/**
 * Created by testu on 4/25/2017.
 */
public class Teacher extends Person {
    public int age;
    public String lector;
    public String faculte;
    public int degree;
    public int expireance;
    public int stayUniver = 15;

    public Teacher(String name, String university, int age, String lector, String faculte, int degree, int expireance) {
        super(name, university, age);
        this.lector = lector;
        this.faculte = faculte;
        this.degree = degree;
        this.expireance = expireance;
    }

    public void teacherInfoVeriable() {
        System.out.println("Student info: " + "name = " + name
                + " university:" + university + " faculte " + faculte + " age: " + age + " degree " + degree + " expireance " + expireance);
    }
    @Override
    public void stayUniversity(){

        System.out.println("Stay univer = " + stayUniver);
    }
}
