package com.bashynskiy.app.classwork.lesson10;

import java.io.*;

/**
 * Created by testu on 4/11/2017.
 */
public class ReaderCheckFile {
    public void readerText(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\\\hello.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exeption you will see this text");
        }
    }
    public void outputWrite() throws IOException {
        String firstLine = "Hello World";
        String secondLine = "Privet privet";
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\\\hello.txt")));
        writer.append(firstLine);
        writer.newLine();
        writer.append(secondLine);
        writer.close();
    }
}
