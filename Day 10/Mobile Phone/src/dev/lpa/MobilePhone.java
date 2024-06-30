package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<com.learnJava.Contact> contactList = new ArrayList<com.learnJava.Contact>();

    // Getters and setters
    public ArrayList<com.learnJava.Contact> getContacts() {
        return contactList;
    }

    public void setContacts(ArrayList<com.learnJava.Contact> contacts) {
        this.contactList = contacts;
    }

    // Methods
    public void printListOfContacts() {
        if(contactList.size() == 0) {
            System.out.println("List of contacts is empty");
        } else {
            System.out.println("/*--- List of contacts ---*/");
            for(int i = 0; i < contactList.size(); i++) {
                System.out.println(contactList.get(i).getName() + ": " + contactList.get(i).getNumber());
            }
        }
    }

    public void addContact(com.learnJava.Contact contact) {
        contactList.add(contact);
        System.out.println("Contact added");
    }

    public void updateContact(String name, com.learnJava.Contact newContact) {
        int position = findContact(name);
        if(position < 0) {
            System.out.println("Contact not found");
        }
        contactList.set(position, newContact);
        System.out.println("Contact updated");
    }

    public void removeContact(String name) {
        int position = findContact(name);
        if(position < 0) {
            System.out.println("Contact not found");
        }
        contactList.remove(position);
        System.out.println("Contact deleted");
    }

    public int findContact(com.learnJava.Contact contact) {
        return contactList.indexOf(contact);
    }

    public int findContact(String contactName) {
        for(int i = 0; i < contactList.size(); i++) {
            com.learnJava.Contact contact = contactList.get(i);
            if(contact.getName().toLowerCase().equals(contactName.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

}
