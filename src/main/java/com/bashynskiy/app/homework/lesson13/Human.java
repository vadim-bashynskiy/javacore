package com.bashynskiy.app.homework.lesson13;

/**
 * Created by admin on 23.04.2017.
 */
//Написать класс Human который имеет только один конструктор (конструктор должен быть с параметрами,
// принимающий на входе возраст и имя человека). Поля возраст и имя должны быть приватными,
// а в классе должны быть реализованы геттеры getName(), getAge() и сеттер setAge (int age)
// который проверяет что возраст человека находится в диапазоне 1..120 лет,
// и в зависимости от этого выводит сообщение “New age setted” и сохраняет значение в поле возраста,
// или выводит сообщение “Age invalid” (если возраст не входит в диапазон).
public class Human  {
    private int age;
    private String name;

    public Human(int age, String name) {
        setAge(age);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 121) {
            System.out.println("New age setted");
            this.age = age;
        } else {
            System.out.println("Age invalid");
        }
    }

    public String getName() {
        return name;
    }
}
