/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class StudentManagement{
    private ArrayList<Student> studentList = new ArrayList<>();

    public StudentManagement() {
        studentList.add(new Student("02", "Hieu", "sp24", "java"));
        studentList.add(new Student("02", "Hieu", "sp24", "sql"));
        studentList.add(new Student("03", "Pham", "sp24", "C++"));
        studentList.add(new Student("01", "Dan", "sp24", "java"));
        studentList.add(new Student("01", "Dan", "sp24", "sql"));
        studentList.add(new Student("01", "Dan", "fa23", "java"));
    }

    
    
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    
    void add(Student st){
        if (studentList.contains(st)) System.out.println("This data is duplicated");
        else studentList.add(st);
    }
    
    void find(String findName){
        for (Student st : studentList){
            if (st.getStudentName().equals(findName)) {
                System.out.println(st);
            }
        }
    }
    
    void sort(){
        Collections.sort(studentList, (Student o1, Student o2) -> o1.getStudentName().compareTo(o2.getStudentName()));
        System.out.println("After sorted");
        System.out.printf("%-10s | %-20s | %-10s | %-10s\n", "ID", "Student name", "Semester", "course");
        for (Student st : studentList){
            System.out.println(st);
        }
    }
    
    void update(Student target){
        for (Student st: studentList){
            if (st.toString().equals(target.toString())) {
                String id = GetInput.get("Enter changing student ID:");
                String name = GetInput.get("Enter changing student name:");
                String semester = GetInput.get("Enter changing number semester");
                String course = GetInput.get("Enter changing name course");
                if ((id.equals(target.getID()) && 
                    name.equals(target.getStudentName()) && 
                    semester.equals(target.getSemester()) && 
                    course.equals(target.getCourseName())) || studentList.contains(target)){
                    System.out.println("Nothing change");
                }else{
                    st.setID(id);
                    st.setStudentName(name);
                    st.setCourseName(course);
                    st.setSemester(semester);
                    System.out.println("Update successfully.");
                }
            }
        }
    }

    void delete(String deleteID){
        studentList.removeIf(student -> deleteID.equals(student.getID()));
        System.out.println("Delete succesfully");
    }
    
    void report(){
        HashMap<String, Integer> report = new HashMap<>();
        for (Student st: studentList){
            String nameNCourse = st.getID() + " | " + st.getStudentName() + " | " + st.getCourseName();
            report.put(nameNCourse, report.getOrDefault(nameNCourse, 0) + 1);
        }
        for(HashMap.Entry<String, Integer> entry : report.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }

    }
    
    
    
}
