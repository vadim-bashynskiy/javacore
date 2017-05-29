package com.bashynskiy.app.homework.lesson19;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Scanner;

/**
 * Created by admin on 28.05.2017.
 */
public class Menu {
    Contact contact = new Contact();
    PhoneBook phoneBook = new PhoneBook();
    Category category = new Category();
    public void printMenu(){
        System.out.println("List all categories - enter 1");
        System.out.println("List all contacts by category - enter 2");
        System.out.println("Add contact - enter 3");
        System.out.println("Add  category - enter 4");
        System.out.println("change contact - enter 5");
        System.out.println("Exit - enter 6");
        swichCase();
    }
    public String  enterString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public void swichCase(){
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                category.printCategoryList();
                menu.printMenu();
                break;
            case 2:
                System.out.println("Enter Category");
                String catName1 = menu.enterString();
                System.out.println(phoneBook.getContactsByCategory(catName1));
                menu.printMenu();
                break;
            case 3:
                System.out.println("Enter Category");
                String catName = menu.enterString();
                System.out.println("Enter Name");
                contact.setName(menu.enterString());
                System.out.println("Enter Phone");
                contact.setPhone(menu.enterString());
                phoneBook.addContact(catName,contact);
                menu.printMenu();
                break;
            case 4:
                System.out.println("Enter Category");
                String newCategory = menu.enterString();
                category.addCategoryList(newCategory);
                menu.printMenu();
                break;
            case 5:
            case 6:
                break;
        }
    }

}
