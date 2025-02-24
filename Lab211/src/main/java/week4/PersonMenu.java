/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author Admin
 */
public class PersonMenu extends Menu{
    PersonManagement pList = new PersonManagement();
    static String[] selection = {"Teacher", "Student", "Person", "Exit"};
    public PersonMenu(){
        super("Information manegement", selection);
    }
    
    @Override
    public void execute(int n) {
        switch(n){
            case(1):
                String[] select1 = {"Input", "Print"};
                Menu teacher = new Menu("Teacher Management", select1) {
                    @Override
                    public void execute(int k) {
                        switch(k){
                            case(1):
                                inputTeacher();
                                break;
                            case(2):
                                printTeacher();
                                break;
                        }
                    }
                };
                teacher.run();
                break;
            case(2):
                String[] select2 = {"Input", "Print"};
                Menu student = new Menu("Student Management", select2) {
                    @Override
                    public void execute(int k) {
                        switch(k){
                            case(1):
                                //inputStudent();
                                break;
                            case(2):
                                printStudent();
                                break;
                        }
                    }
                };
                student.run();
                break;
            case(3):
                String[] select3 = {"Search", "Print all"};
                Menu person = new Menu("Person Management", select3) {
                    @Override
                    public void execute(int k) {
                        switch(k){
                            case(1):
                                search();
                                break;
                            case(2):
                                printAll();
                                break;
                        }
                    }
                };
                person.run();
                break;
            case(4):
                System.exit(0);
                break;
        }
    }
    
    void inputTeacher(){
        Teacher t = new Teacher();
        t.inputAll();
        pList.addPerson(t);
    }
    
    void inputStudent(){
        Student2 st = new Student2();
        st.inputAll();
        pList.addPerson(st);
    }
    
    void printTeacher(){
        for (Person p : pList.getPersons()){
            if (p instanceof Teacher) System.out.println(((Teacher)p));
        }
    }
    
    void printStudent(){
        for (Person p : pList.getPersons()){
            if (p instanceof Student2) System.out.println(((Student2)p));
        }
    }
    
    void printAll(){
        for (Person p : pList.getPersons()){
            System.out.println(p);
        }
    }
    
    void search(){
        String name = GetInput.get("Name: ");
        for (Person p: pList.getPersons()){
            if (name.equals(p.getFullName())) System.out.println(p);
        }
    }
    
    public static void main(String[] args) {
        PersonMenu run = new PersonMenu();
        run.run();
    }
}
