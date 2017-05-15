package com.bashynskiy.runners.classwork.lesson16_interface;

import com.bashynskiy.app.classwork.lesson16_interface.ACMEBicycle;
import com.bashynskiy.app.classwork.lesson16_interface.Bicycle;
import com.bashynskiy.app.classwork.lesson16_interface.Maintenence;
import com.bashynskiy.app.classwork.lesson16_interface.PartsStandart;

/**
 * Created by testu on 5/12/2017.
 */
public class Interface_runner {
    public static void main(String[] args) {
        Bicycle bicycle = new ACMEBicycle();
        bicycle.changeGear(15);
        bicycle.showSpeed();
        // для всех послед обьектов
        PartsStandart partsStandart = new ACMEBicycle();
        partsStandart.useEcoItems();

        ACMEBicycle acmeBicycle = new ACMEBicycle();
        acmeBicycle.printStates();
        //применится только для одного обьекта
        acmeBicycle.useEcoItems();

        Maintenence maintenence = new ACMEBicycle();
        maintenence.clean();
        //выводим просто всю инфу с обьекта
        System.out.println(acmeBicycle.getCadence());
        System.out.println(acmeBicycle.getGear());
        System.out.println(acmeBicycle.getSpeed());
        //метод ту стринг
        System.out.println(acmeBicycle.toString().split(" ")[0]);

        //обьект интерфейса с помощью  анонимный клас в основном не используется
        Bicycle bicycle1 = new Bicycle() {
            @Override
            public void changeGear(int newValue) {

            }

            @Override
            public void changeCadence(int newValue) {

            }
        };
        bicycle1.changeGear(10);
    }
}
