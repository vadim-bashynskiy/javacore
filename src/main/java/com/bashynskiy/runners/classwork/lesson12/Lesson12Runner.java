package com.bashynskiy.runners.classwork.lesson12;

import java.io.File;

/**
 * Created by testu on 4/21/2017.
 */

// указание пути к файлам через пропертю с помощью которой можно юзать и на линоксе тесты и на винде
public class Lesson12Runner {
    public static void main(String[] args) {
        //директория проекта нашего
        String currentDir = System.getProperty("user.dir");
        //различные стайлы
        String windowsStyle = "src\\test\\resources\\maxList.csv";
        String linuxStile = "src/test/resources/maxList.csv";
        // операционная система
        String osName = System.getProperty("os.name");

        if (osName.toLowerCase().contains("win")) {

            File file = new File(currentDir, windowsStyle);
            System.out.println(currentDir);
            System.out.println(file.getAbsolutePath());
            System.out.println(osName);
        }else {
            File file = new File(currentDir,linuxStile);
            System.out.println(file.getAbsolutePath());
            System.out.println(currentDir);
            System.out.println(osName);
        }

    }
}
