package com.bashynskiy.runners.classwork.lesson17;

import com.bashynskiy.app.classwork.lesson17.Company;

/**
 * Created by testu on 5/16/2017.
 */
public class CompanyRunners {
    public static void main(String[] args) {
        for (Company cName: Company.values()) {
            System.out.println("Company value" + cName.getValue() + "- Company name: " + cName.name());
        }
    }
}
