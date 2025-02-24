/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.time.Year;

public class Person {
    private int ID;
    private String fullName, phoneNumber;
    private int yob;
    private String major;

    public Person() {
        this.ID = 0;
        this.fullName = "";
        this.phoneNumber = "";
        this.yob = 0;
        this.major = "";
    }
    
    void inputAll(){
        setID(GetInput.checkInt("Enter ID: ",1000000));
        setFullName(GetInput.getWithRegex("Enter full name:", "^[A-Za-z ]+$"));
        setPhoneNumber(GetInput.getWithRegex("Enter phone number:", "^\\d{12}$"));
        setYob(GetInput.checkInt("Enter year of birth:", Year.now().getValue()));
        setMajor(GetInput.getWithRegex("Enter major: ", "^.{1,30}$"));
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return  "ID=" + ID + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", yob=" + yob + ", major=" + major;
    }
    
    
    
}
