package com.bashynskiy.app.homework.lesson14;

/**
 * Created by admin on 04.05.2017.
 */
//Полиморфизм:
//Необходимо реализовать иерархию цветов (для примера, пусть это будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
//Создать несколько объектов-цветов. Собрать букет с определением его стоимости. В букет может входить несколько цветов одного типа.
public interface Flower {
    double price();
    String nameFlower();
}
