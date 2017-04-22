package com.bashynskiy.app.homework.lesson11;

import com.bashynskiy.app.classwork.lesson9.StringPolindrome;

import java.io.*;
import java.util.Scanner;

/**
 * Created by admin on 22.04.2017.
 */
//

//Реализовать программу, которая при запуске запрашивает у пользователя имя файла и затем запрашивает у пользователя текст,
// считывая его построчно с консоли и сохраняя в файл.
// При вводе комбинации символов *exit* программа сохраняет все введенные строки в файл и завершает свою работу.

public class InputFileName {
    public void createFileAndAddWorlds() throws IOException {
        try {
            String workingDirectory = System.getProperty("user.dir");
            String absoluteFilePath;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input file name");
            String name = scanner.nextLine();
            String pathToFile = "\\src\\test\\resources\\" + name + ".txt";
            absoluteFilePath = workingDirectory + pathToFile;
            File file = new File(absoluteFilePath);

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File is already existed! You can change him");
            }
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absoluteFilePath)));
            System.out.println("Please add text to file and if you enter exit, program will be close");
            String world = scanner.nextLine();
            while (!world.equalsIgnoreCase("exit")) {
                writer.append(world + "\n");
                world = scanner.nextLine();
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
