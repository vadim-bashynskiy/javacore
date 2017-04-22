package com.bashynskiy.app.homework.lesson11;

import java.io.*;
import java.util.Arrays;

/**
 * Created by admin on 22.04.2017.
 */
public class ReadAndWriteSortNumbers {
    public int[] readerFile() {
        System.out.print("Random int array = ");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\javacore\\src\\test\\resources\\fileNumbersRead.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                StringBuilder stringBuilder = new StringBuilder(line);
                int[] numArr = Arrays.stream(stringBuilder.toString().split(",")).mapToInt(Integer::parseInt).toArray();
                String firstLine = Arrays.toString(numArr).replace("[", "").replace("]", "");
                System.out.println(firstLine);
                return numArr;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
        return new int[0];
    }

    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public void writeFile(int[] array) throws IOException {
        String firstLine = Arrays.toString(array).replace("[", "").replace("]", "");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\javacore\\src\\test\\resources\\fileNumbersWrite.txt")));
        writer.append(firstLine);
        writer.close();
    }

    public void fileReadResult() throws IOException {
        writeFile(sort(readerFile()));
        System.out.print("Sort integer numbers = ");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\javacore\\src\\test\\resources\\fileNumbersWrite.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
