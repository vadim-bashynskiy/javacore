package com.bashynskiy.runners.classwork.lesson13;

import com.bashynskiy.app.classwork.lesson13.Person;
import com.bashynskiy.app.classwork.lesson13.Student;

/**
 * Created by testu on 4/25/2017.
 */
public class Lesson13Runner {
    public static void main(String[] args) {
        String name = "Vadim";
        String university="bla";
        int age = 27;
        Student student = new Student(name,university,age);
        student.age = 27;
        student.printStudentInfo();
    }
}
