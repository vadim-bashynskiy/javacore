package com.bashynskiy.app.homework.lesson19;

import java.awt.*;
import java.awt.List;
import java.util.*;

/**
 * Created by VBashynskyi on 26.05.2017.
 */
public class PhoneBook {
    HashMap<String, ArrayList<Contact>> hashMap = new HashMap<>();
    public ArrayList<Contact> getContactsByCategory(String category){
        return hashMap.get(category);
    }

    public void addContact(String category, Contact contact) {
        ArrayList<Contact> contacts = hashMap.get(category);
        if (contacts == null) {
            contacts = new ArrayList<>();
            hashMap.put(category, contacts);
        }
        contacts.add(contact);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact("Vadim","+380938311526");
             phoneBook.addContact("Home", contact);
    }
}
