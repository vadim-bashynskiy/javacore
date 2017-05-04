package com.bashynskiy.runners.classwork.polimorfism;

import com.bashynskiy.app.classwork.polimorfism.*;

/**
 * Created by testu on 4/28/2017.
 */
//интерфейса
public class PolimorfismRunner {
    public static void main(String[] args) {
        // IBM ibm = new IBM();
        //ibm.changeRam();
        Computer ibmComputer = new IBM();
        Computer hpComputer = new HP();
        Computer acerComputer = new Accer();
//        changesForComputers(ibmComputer);
//        changesForComputers(hpComputer);
//        changesForComputers(acerComputer);
        Computer mac = new Mac();
        Computer lenovo = new Lenovo();
//        changesForComputers(mac);
        //c масивом
        Computer[] computers = new Computer[5];
        computers[0] = ibmComputer;
        computers[1] = hpComputer;
        computers[2] = acerComputer;
        computers[3] = mac;
        computers[4] = lenovo;
        changesForComputersArray(computers);
    }

    public static void changesForComputers(Computer computer) {
        computer.changeRam();
        computer.changeTOSSD();
        computer.changeCPU();

    }

    public static void changesForComputersArray(Computer[] computers) {
        for (Computer computer : computers) {
            changesForComputers(computer);
            //computer.changeRam();
            //computer.changeTOSSD();
        }
    }
}