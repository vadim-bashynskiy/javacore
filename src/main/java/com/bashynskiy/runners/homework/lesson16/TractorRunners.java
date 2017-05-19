package com.bashynskiy.runners.homework.lesson16;

import com.bashynskiy.app.homework.lesson16.*;

/**
 * Created by admin on 19.05.2017.
 */
//Создать демонстрационный класс, в котором создаются экземпляры обоих потомков,
// и производится вызов методов для вывода информации о нашем транспорте.
public class TractorRunners {
    public static void main(String[] args) {

       /* Tractor tractor = new WheeledTractor("WheelTractor", 11, 2, 4, 9);
        Tractor tractor1 = new CrawlerTractor("CrawledTractor", 9, 1, 0, 15);

        tractor.printNameTransport();
        tractor.getMass();
        tractor.getSpeed();
        tractor.numberWheels();
        tractor.peopleNumbers();

        tractor1.printNameTransport();
        tractor1.getMass();
        tractor1.getSpeed();
        tractor1.numberWheels();
        tractor1.peopleNumbers();*/

        Run crawledTractor = new CrawlerTractor("CrawledTractor", 80, 3, 0, 17);
        crawledTractor.printNameTransport();
        crawledTractor.getMass();
        crawledTractor.getSpeed();
        crawledTractor.numberWheels();
        crawledTractor.peopleNumbers();

        Run wheelTractor = new WheeledTractor("WheelTractor", 13, 10, 4, 20);
        wheelTractor.printNameTransport();
        wheelTractor.getMass();
        wheelTractor.getSpeed();
        wheelTractor.numberWheels();
        wheelTractor.peopleNumbers();
    }
}
