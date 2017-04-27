package com.bashynskiy.runners.classwork.lesson12;

import com.bashynskiy.app.classwork.lesson12.Person;
import com.bashynskiy.app.classwork.lesson12.Teacher;

/**
 * Created by testu on 4/25/2017.
 */
public class TeacherRunner {
    public static void main(String[] args) {
        String university = "KPI";
        String name = "Vadim";
        String faculte = "SE";
        String lector = "Serega";
        int degree = 12;
        int expiriance = 3;
        int age =27;
        Person person = new Person(name,university,age);
        Teacher teacher = new Teacher(name,university,age,lector,faculte,degree,expiriance);
       teacher.teacherInfoVeriable();

       teacher.stayUniversity();
       person.stayUniversity();

    }

}
