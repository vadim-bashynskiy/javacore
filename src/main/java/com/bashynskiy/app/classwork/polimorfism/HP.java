package com.bashynskiy.app.classwork.polimorfism;

/**
 * Created by testu on 4/28/2017.
 */
public class HP extends Computer {
    @Override
    public void changeRam(){
        System.out.println("Changinr HP Ram memory");
    }
    @Override
    public void changeTOSSD(){
        System.out.println("Changing HP SSD");
    }
    @Override
    public void changeCPU(){
        System.out.println("Chage HP CPU");
    }
}
