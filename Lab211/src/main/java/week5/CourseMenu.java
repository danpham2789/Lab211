/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author Admin
 */
public class CourseMenu extends Menu{
    CourseManagement courseList;
    static String[] selection = {"Add online/offline course", 
                                "Update course",
                                "Delete course",
                                "Print all/online course/offline course",
                                "Search information base on course name",
                                "Exit"};
    public CourseMenu(){
        super("Course management menu", selection);
        courseList = new CourseManagement();
    }
    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                addCourse();
                break;
            case 2:
                updateCourse();
                break;
            case 3:
                deleteCourse();
                break;
            case 4:
                print();
                break;
            case 5:
                search();
                break;
            case 6:
                System.exit(0);
        }
    }
    
    void addCourse(){
        System.out.println("*** Add new course ***");
        String choice = GetInput.check("Online (O) or Offline (F):", "O", "F");
        if (choice.equals("O")) {
            OnlineCourse onlineC = new OnlineCourse();
            onlineC.inputAll(GetInput.get("Enter course ID:"), 
                    GetInput.get("Enter course name:"), 
                    GetInput.checkInt("Enter course credit:"), 
                    GetInput.get("Enter course platform:"), 
                    GetInput.get("Enter course instructor:"), 
                    GetInput.get("Enter course note:"));
            courseList.addOnlineCourse(onlineC);
        }else{
            OfflineCourse offlineC = new OfflineCourse();
            offlineC.inputAll(GetInput.get("Enter course ID:"), 
                    GetInput.get("Enter course name:"), 
                    GetInput.checkInt("Enter course credit:"), 
                    GetInput.checkDate("Enter begin date:"), 
                    GetInput.checkDate("Enter end date:"), 
                    GetInput.get("Enter campus:"));
            courseList.addOfflineCourse(offlineC);
        }
    }
    
    void updateCourse(){
        if (!courseList.updateCourse(GetInput.get("Enter course ID to update:"))) {
            if (GetInput.check("No data found, do you want to find again? (Y/N): ","Y","N").equals("Y")) updateCourse();    
        }
    }
    
    void deleteCourse(){
        if (!courseList.updateCourse(GetInput.get("Enter course ID to delete:"))) {
            if (GetInput.check("No data found, do you want to find again? (Y/N): ","Y","N").equals("Y")) deleteCourse();    
        }
    }
    
    void print(){
        String choice = "";
        while(!choice.equals("A") && !choice.equals("O") && !choice.equals("F")){
            choice = GetInput.get("Do you want to print all (A), online course (O) or offline course (F):");
        }
        if (choice.equals("A")) courseList.display();
        else courseList.display(choice);
    }
    
    void search(){
        if (!courseList.updateCourse(GetInput.get("Enter course ID to search:"))) {
            if (GetInput.check("No data found, do you want to find again? (Y/N): ","Y","N").equals("Y")) search();    
        }
    }
    
    public static void main(String[] args) {
       CourseMenu menu = new CourseMenu();
       menu.run();
    }
    
}
