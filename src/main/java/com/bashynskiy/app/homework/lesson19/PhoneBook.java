package com.bashynskiy.app.homework.lesson19;
import java.util.*;

/**
 * Created by VBashynskyi on 26.05.2017.
 */
public class PhoneBook {
    private String contactName;
    private String contactPhone;
   public  HashMap<String, ArrayList<Contact>> hashMap = new HashMap<>();
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
    public void listAllCategoty(){
       System.out.println(hashMap.keySet());
    }
    public Contact findContact(String name){
        for (Map.Entry<String, ArrayList<Contact>> entry: hashMap.entrySet()) {
            for (Contact contact:entry.getValue()) {
             if (name.equals(contact.getName())){
                 return contact;

             }
            }
        }
        return null;
            }
    public boolean addCategory(String category){
        ArrayList<Contact> contacts = hashMap.get(category);
        if (contacts == null) {
            contacts = new ArrayList<>();
            hashMap.put(category, contacts);
            return true;
        }
        return false;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.printMenu();
        /*PhoneBook phoneBook = new PhoneBook();
        Category category = new Category();
        category.addCategoryList("Family");
        category.addCategoryList("Family2");
        Contact contact = new Contact("Vadim","+380938311526");
        phoneBook.addContact("Home1", contact);
        Contact contact1 = new Contact("Vadims","+380938311426");
        phoneBook.addContact("Home1", contact1);
        System.out.println("список контактов по категории");
        System.out.println(phoneBook.getContactsByCategory("Home1"));
        System.out.println("Список всех категорий");
        category.printCategoryList();
        Contact contact2 = new Contact("Vadimka","+3809328311426");
        phoneBook.addContact("Home1", contact2);
        System.out.println("список контактов по категории Home1");
        System.out.println(phoneBook.getContactsByCategory("Home1"));*/


    }
}
