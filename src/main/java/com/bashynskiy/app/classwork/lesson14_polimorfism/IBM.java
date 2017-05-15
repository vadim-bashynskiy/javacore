package com.bashynskiy.app.classwork.lesson14_polimorfism;

/**
 * Created by testu on 4/28/2017.
 */
public class IBM extends Computer {
    @Override
    public void changeRam(){
        System.out.println("Changinr IBM Ram memory");
    }
    @Override
    public void changeTOSSD(){
        System.out.println("Changing IBM SSD");
    }
    public void changingOnlyForIBM(){
        System.out.println("Changing only for IBM");
    }
    @Override
    public void changeCPU(){
        System.out.println("Chage IBM CPU");
    }
}
