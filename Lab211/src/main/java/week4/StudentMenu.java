/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author Admin
 */
public class StudentMenu extends Menu<String>{

    static String[] selection = {"Create", "Find and Sort", "Update/Delete", "Report", "Exit"};
    public StudentMenu(){
        super("Welcome to student manegement", selection);
    }
    @Override
    public void execute(int n) {
        switch(n){
            case(1):
                create();
                break;
            case(2):
                findSort();
                break;
            case(3):
                updateDelete();
                break;
            case(4):
                report();
                break;
            case(5):
                System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        StudentMenu test = new StudentMenu();
        test.run();
    }
    StudentManagement studentMan = new StudentManagement();
    void create(){
        int count = 0;
        while(count < 3){
            String id = GetInput.get("Enter student ID:");
            String name = GetInput.get("Enter student name:");
            String semester = GetInput.get("Enter number semester");
            String course = GetInput.get("Enter name course");
            studentMan.add(new Student(id, name, semester, course));
            count++;
            if (count == 3) {
                if ("Y".equals(GetInput.check("Do you want to continue (Y/N)?", "Y", "N"))) count--;
            }
        }
    }
    
    void findSort(){
        String findName = GetInput.get("Enter student name want to search");
        studentMan.find(findName);
        studentMan.sort();
    }
    
    void updateDelete(){
        String choice = GetInput.check("(Do you want to update (U) or delete (D) student.", "U", "D");
        if ("U".equals(choice)){
            String id = GetInput.get("Enter student ID to find:");
            String name = GetInput.get("Enter student name to find:");
            String semester = GetInput.get("Enter number semester to find");
            String course = GetInput.get("Enter name course to find");
            Student target = new Student(id, name, semester, course);
            studentMan.update(target);
        }else {
            String deleteID = GetInput.get("Enter student ID to delete:");
            studentMan.delete(deleteID);
        }
    }
    
    void report(){
        studentMan.report();
    }
}
