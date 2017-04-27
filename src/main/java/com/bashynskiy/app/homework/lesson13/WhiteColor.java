package com.bashynskiy.app.homework.lesson13;

/**
 * Created by admin on 23.04.2017.
 */
//Реализовать класс WhiteCollar, который наследует Human и в конструкторе принимает значения возраста, имени и компании,
// при этом вызывая родительский конструктор для сохранения в приватные поля имени и возраста.
//Реализовать сеттер setCompany (String string), который сохраняет в поле companyName введенное значение,
// если оно состоит только из латинских символов, тире, пробела и/или запятых. В противном случае выводится сообщение “Company name is invalid”.

public class WhiteColor extends Human {
    private String company;
    public WhiteColor(int age, String name, String company) {
        super(age, name);
        setCompany(company);
    }

    public void setCompany(String company) {
        if (company.matches("^[a-zA-Z0-9, _]+$") == true){
            this.company = company;
        }else{
            System.out.println("Company name is invalid");
        }
    }
}

