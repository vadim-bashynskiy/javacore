package com.bashynskiy.runners.classwork.lesson17;

import com.bashynskiy.app.classwork.lesson17.User;

/**
 * Created by testu on 5/16/2017.
 */
public class EqualsUserRunner {
    public static void main(String[] args) {
        User user = new User();
        user.setName("KIT1");
        user.setAge(10);
        user.setPassport("UKR");
        User user2 = new User();
        user2.setAge(10);
        user2.setName("KIT");
        user2.setPassport("UKR");

        System.out.println(user.equals(user2));
    }

}
