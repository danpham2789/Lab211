/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class Contact {
    static int idCount = 1;
    private int id;
    private String name;
    private String firstName, lastName, group, address, phone;

    public Contact(String firstName, String lastName, String group, String address, String phone) {
        this.id = idCount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = firstName + lastName;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }
    
    void setFirstNLastName(){
        StringTokenizer tempName = new StringTokenizer(name);
        firstName = tempName.nextToken();
        lastName = tempName.nextToken();
        while(tempName.hasMoreTokens()){
            lastName += tempName.nextToken();
        }
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        setName(this.firstName + " " + this.lastName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        setName(this.firstName + " " + this.lastName);
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (!(this.firstName + this.lastName).equals(this.name)) setFirstNLastName();
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("%-3d %-20s %-15s %-15s %-10s %-10s %-15s\n", id,name,firstName,lastName,group,address,phone);
    }
    
    
    
}
