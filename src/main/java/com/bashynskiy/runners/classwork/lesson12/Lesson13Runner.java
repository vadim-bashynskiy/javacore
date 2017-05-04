package com.bashynskiy.runners.classwork.lesson12;

import com.bashynskiy.app.classwork.lesson12.Student;

/**
 * Created by testu on 4/25/2017.
 */
public class Lesson13Runner {
    public static void main(String[] args) {
        String name = "Vadim";
        String university="bla";
        int age = 30;
        Student student = new Student(name,university,age);
        student.setAge(27);
        student.printStudentInfo();
    }
}
