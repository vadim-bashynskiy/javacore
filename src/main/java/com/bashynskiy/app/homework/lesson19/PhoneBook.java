package com.bashynskiy.app.homework.lesson19;

import java.util.*;

/**
 * Created by VBashynskyi on 26.05.2017.
 */
public class PhoneBook {

    public HashMap<String, ArrayList<Contact>> hashMap = new HashMap<>();

    public ArrayList<Contact> getContactsByCategory(String category) {
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

    public void listAllCategoty() {
        System.out.println(hashMap.keySet());
    }

    public Contact findContact(String name) {
        for (Map.Entry<String, ArrayList<Contact>> entry : hashMap.entrySet()) {
            for (Contact contact : entry.getValue()) {
                if (name.equals(contact.getName())) {
                    return contact;

                }
            }
        }
        return null;
    }

    public boolean addCategory(String category) {
        ArrayList<Contact> contacts = hashMap.get(category);
        if (contacts == null) {
            contacts = new ArrayList<>();
            hashMap.put(category, contacts);
            return true;
        }
        return false;
    }
}
