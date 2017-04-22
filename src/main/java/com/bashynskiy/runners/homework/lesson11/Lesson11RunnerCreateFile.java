package com.bashynskiy.runners.homework.lesson11;

import com.bashynskiy.app.homework.lesson11.InputFileName;

import java.io.IOException;

/**
 * Created by admin on 22.04.2017.
 */
public class Lesson11RunnerCreateFile {
    public static void main(String[] args) throws IOException {
        InputFileName inputFileName = new InputFileName();
        inputFileName.createFileAndAddWorlds();
    }
}
