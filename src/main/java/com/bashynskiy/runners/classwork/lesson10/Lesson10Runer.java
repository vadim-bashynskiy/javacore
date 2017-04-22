package com.bashynskiy.runners.classwork.lesson10;

import com.bashynskiy.app.classwork.lesson10.Enigma;
import com.bashynskiy.app.classwork.lesson10.ReaderCheckFile;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by testu on 4/11/2017.
 */
public class Lesson10Runer {
    public static void main(String[] args) throws IOException {
        Enigma enigma = new Enigma();
        ReaderCheckFile readerCheckFile = new ReaderCheckFile();
        //readerCheckFile.readerText();
        readerCheckFile.outputWrite();
        //System.out.println("Our new code = " + enigma.encode());
       // System.out.println("Decode = " + enigma.decode());
    }
}
