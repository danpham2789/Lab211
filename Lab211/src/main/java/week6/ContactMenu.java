/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author Admin
 */
public class ContactMenu extends Menu<String>{

    static String[] selection = {"Add contact", "Display the contact", "Delete contact", "Exit"};
    ContactManagement cManagement;


    public ContactMenu() {
        super("Contact Program", selection);
        cManagement = new ContactManagement();
    }
    
    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                addContact();
                break;
            case 2:
                displayAllContact();
                break;
            case 3:
                deleteContact();
                break;
            case 4:
                System.exit(0);
        }
    }
    
    
    void addContact(){
        String firstName = GetInput.get("Enter first name: ");
        String lastName = GetInput.get("Enter last name: ");
        String group = GetInput.get("Enter group: ");
        String address = GetInput.get("Enter address: ");
        String phone = GetInput.getWithRegex("Enter phone: ", "^(\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4})(?:\\s?(?:x|ext)\\d{1,5})?$");
        cManagement.addContact(new Contact(firstName, lastName, group, address, phone));
    }
    
    void displayAllContact(){
        cManagement.displayContact();
    }
    
    void deleteContact(){
        int id = GetInput.checkInt("Enter ID: ");
        boolean check;
        do {
            check = cManagement.deleteContactByID(id);
        }while (!check);
    }
    
    public static void main(String[] args) {
        ContactMenu menu = new ContactMenu();
        menu.run();
    }
}
