/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ContactManagement {
    ArrayList<Contact> contacts = new ArrayList<>();

    public ContactManagement() {
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }
    
    boolean isExist(Contact check){
        for (Contact c : contacts){
            if (check.getName().equals(c.getName()) && check.getGroup().equals(c.getGroup()) 
                    && check.getAddress().equals(c.getAddress()) && check.getPhone().equals(c.getPhone()))
                return true;
        }
        return false;
    }
    
    void addContact(Contact c){
        if (!isExist(c)) {contacts.add(c); Contact.idCount++;}
        else System.out.println("Duplicate contact");
    }
    
    void displayContact(){
        if (contacts.isEmpty()) {System.out.println("Empty contact list"); return;}
        System.out.println("========================================");
        System.out.printf("%-3s %-20s %-15s %-15s %-10s %-10s %-15s\n", "ID", "Name", "First Name", "Last Name","Group", "Address", "Phone");
        for (Contact c: contacts){
            System.out.println(c);
        }
    }
    
    boolean deleteContactByID(int id){
        if (contacts.isEmpty()) {System.out.println("Contact list is empty"); return true;}
        int length = contacts.size();
        contacts.removeIf(c -> c.getId() == id);
        if (length == contacts.size()) {System.out.println("Invalid id"); return false;}
        return true;
    }
}
