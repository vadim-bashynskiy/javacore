package com.bashynskiy.app.classwork.lesson14_polimorfism;

/**
 * Created by testu on 4/28/2017.
 */
public class Lenovo extends Computer {
    @Override
    public void changeRam(){
        System.out.println("Changinr Lenovo Ram memory");
    }
    @Override
    public void changeTOSSD(){
        System.out.println("Changing Lenovo SSD");
    }

    @Override
    public void changeCPU(){
        System.out.println("Chage Lenovo CPU");
    }
}
