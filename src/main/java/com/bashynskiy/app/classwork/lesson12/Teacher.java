package com.bashynskiy.app.classwork.lesson12;

/**
 * Created by testu on 4/25/2017.
 */
public class Teacher extends Person {
    private String lector;
    private String faculte;
    private int degree;
    private int expireance;
    private int stayUniver = 15;

    public Teacher(String name, String university, int age, String lector, String faculte, int degree, int expireance) {
        super(name, university, age);
        this.lector = lector;
        this.faculte = faculte;
        this.degree = degree;
        this.expireance = expireance;
    }

    public void teacherInfoVeriable() {
        System.out.println("Student info: " + "name = " + getName()
                + " university:" + getUniversity() + " faculte " + getFaculte() + " age: " + getAge() + " degree " + getDegree() + " expireance " + getExpireance());
    }
    @Override
    public void stayUniversity(){

        System.out.println("Stay univer = " + stayUniver);
    }

    public String getLector() {
        return lector;
    }

    public void setLector(String lector) {
        this.lector = lector;
    }

    public String getFaculte() {
        return faculte;
    }

    public void setFaculte(String faculte) {
        this.faculte = faculte;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public int getExpireance() {
        return expireance;
    }

    public void setExpireance(int expireance) {
        this.expireance = expireance;
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
