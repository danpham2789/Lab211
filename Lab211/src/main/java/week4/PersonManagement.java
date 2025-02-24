/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class PersonManagement {
    ArrayList<Person> persons = new ArrayList<>();

    public PersonManagement() {
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    
    
    
    void addPerson(Person p){
        persons.add(p);
    }
}
