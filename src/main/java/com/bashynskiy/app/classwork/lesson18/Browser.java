package com.bashynskiy.app.classwork.lesson18;

/**
 * Created by testu on 5/23/2017.
 */
public class Browser {
    private String name;
    private int version;
    //overloading делается для методов в основном c разным количеством параметров и типов
   public void invoke(String name){
       System.out.println(name);
   }

   public void invoke(String name, int version){
       invoke(name);
       System.out.print(" " + version);
   }

}
