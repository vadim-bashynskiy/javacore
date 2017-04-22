package com.bashynskiy.runners.homework.lesson11;

import com.bashynskiy.app.homework.lesson11.ReadAndWriteSortNumbers;

import java.io.*;

/**
 * Created by admin on 22.04.2017.
 */
//Реализовать чтение из файла строк с массивами чисел, разделенными запятыми,
// и их сортировку с последующей записью в другой файл. Для чтения файла и записи в файл создать вспомогательные классы и/или методы.
public class Lesson11RunnerSort {

    public static void main(String[] args) throws IOException {
        ReadAndWriteSortNumbers readAndWriteSortNumbers = new ReadAndWriteSortNumbers();
        readAndWriteSortNumbers.fileReadResult();
    }

}
