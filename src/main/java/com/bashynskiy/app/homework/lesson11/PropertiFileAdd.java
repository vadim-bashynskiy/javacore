package com.bashynskiy.app.homework.lesson11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by admin on 22.04.2017.
 */
/*Написать программу, которая создает properties file и считывает с консоли данные,
  введенные пользователем в формате ключ и его значение, разделенное запятой. Например “dbname, localhost”.
  При вводе пустой строки - программа сохраняет все данные в файл и затем выводит ключи и значения c разделителем в виде “=”, например “dbname=localhost”.
  Более подробно - https://www.mkyong.com/java/java-properties-file-examples/. ОБРАТИТЕ ваше внимание на то, что ключи не должны дублироваться:
если пользователь ввел новое значение для уже ранее введенного ключа - то старое значение ключа следует заменить новым.*/
public class PropertiFileAdd {
    public void createProp() {
        Scanner scanner = new Scanner(System.in);
        Properties prop = new Properties();
        OutputStream output = null;
        int errorCount = 0;
        try {
            output = new FileOutputStream("config.properties");
            // set the properties value
            for (int i = 0; i < 3; i++) {
                if (errorCount == 0) {
                    String keyAndValue = scanner.nextLine();
                    String[] mass = keyAndValue.toString().split(",");
                    for (int j = 0; j < mass.length; j++) {
                        if (mass[j] == "" || mass[j + 1] == "" || mass[j].equalsIgnoreCase(" ") || mass[j + 1].equalsIgnoreCase(" ")) {
                            System.out.println("space detected");
                            errorCount++;
                            break;
                        } else {
                            prop.setProperty(mass[j], mass[j + 1]);
                            // save properties to project root folder
                            prop.store(output, null);
                            j++;
                        }
                    }
                } else {
                    break;
                }
            }


        } catch (IOException io) {
            io.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Missing parameters");
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
