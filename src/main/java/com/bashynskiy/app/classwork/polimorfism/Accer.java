package com.bashynskiy.app.classwork.polimorfism;

/**
 * Created by testu on 4/28/2017.
 */
public class Accer extends Computer {
    @Override
    public void changeRam(){
        System.out.println("Changinr ACCER Ram memory");
    }
    @Override
    public void changeTOSSD(){
        System.out.println("Changing ACCER SSD");
    }
    @Override
    public void changeCPU(){
        System.out.println("Chage Accer CPU");
    }
}
