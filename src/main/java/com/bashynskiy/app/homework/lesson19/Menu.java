package com.bashynskiy.app.homework.lesson19;

import java.util.Scanner;

/**
 * Created by admin on 28.05.2017.
 */
public class Menu {
    PhoneBook phoneBook = new PhoneBook();

    public void printMenu() {
        System.out.println("List all categories - enter 1");
        System.out.println("List all contacts by category - enter 2");
        System.out.println("Add contact - enter 3");
        System.out.println("Add  category - enter 4");
        System.out.println("Change contact - enter 5");
        System.out.println("Exit - enter 6");
        swichCase();
    }

    public String enterString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void swichCase() {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                phoneBook.listAllCategoty();
                System.out.println("___________________________________________________________");
                printMenu();
                break;
            case 2:
                System.out.println("Enter Category");
                String catName1 = enterString();
                System.out.println(phoneBook.getContactsByCategory(catName1));
                System.out.println("___________________________________________________________");
                printMenu();
                break;
            case 3:
                System.out.println("Enter Name");
                String ConName = enterString();
                Contact contact1 = phoneBook.findContact(ConName);
                if (contact1 != null) {
                    System.out.println("Name already use");
                } else {
                    Contact contact = new Contact();
                    System.out.println("Enter Category");
                    String catName = enterString();
                    contact.setName(ConName);
                    System.out.println("Enter Phone");
                    contact.setPhone(enterString());
                    phoneBook.addContact(catName, contact);
                }
                System.out.println("___________________________________________________________");
                printMenu();
                break;
            case 4:
                System.out.println("Enter Category");
                String newCategory = enterString();
                if (phoneBook.addCategory(newCategory)) {
                    System.out.println("Category was added");
                } else {
                    System.out.println("You already have this category");
                }
                System.out.println("___________________________________________________________");
                printMenu();
                break;
            case 5:
                System.out.println("Enter name");
                String findName = enterString();
                Contact contact = phoneBook.findContact(findName);
                if (contact == null) {
                    System.out.println("Not found");
                } else {
                    System.out.println("Enter new name (enter to skip)");
                    String newName = enterString();
                    if (!newName.isEmpty()) {
                        contact.setName(newName);
                    }
                    System.out.println("Enter new phone (enter to skip)");
                    String newPhone = enterString();
                    if (!newPhone.isEmpty()) {
                        contact.setPhone(newPhone);
                    }
                }
                System.out.println("___________________________________________________________");
                printMenu();
                break;
            case 6:
                break;
        }
    }

}
