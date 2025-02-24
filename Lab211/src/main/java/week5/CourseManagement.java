/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CourseManagement {
    ArrayList<Course> courses = new ArrayList<>();
    
    boolean addOnlineCourse(OnlineCourse on){
        if(!courses.contains(on)) {courses.add(on); return true;}
        return false;
    }
    
    boolean addOfflineCourse(OfflineCourse off){
        if(!courses.contains(off)) {courses.add(off); return true;}
        return false;
    }
    
    boolean deleteCourse(String deleteID){
        int length = courses.size();
        courses.removeIf(c -> deleteID.equals(c.getCourseID()));
        return courses.size() != length;
    }
    
    boolean updateCourse(String updateID){
        boolean temp = false;
        for (Course c: courses){
            if (c.getCourseID().equals(updateID)){
                temp = true;
                c.setCourseID(GetInput.get("Enter new ID"));
                c.setCourseName(GetInput.get("Enter new name"));
                c.setCredit(GetInput.checkInt("Enter new credit"));
                if (c instanceof OnlineCourse){
                    ((OnlineCourse) c).setInstructors(GetInput.get("Enter new instructors"));
                    ((OnlineCourse) c).setPlatform(GetInput.get("Enter new platform"));
                    ((OnlineCourse) c).setNote(GetInput.get("Enter new note"));
                }else {
                    ((OfflineCourse) c).setBegin(GetInput.checkDate("Enter new begin date"));
                    ((OfflineCourse) c).setEnd(GetInput.checkDate("Enter new end date"));
                    ((OfflineCourse) c).setCampus(GetInput.get("Enter new campus"));
                }
            }
        }
        return temp;
    }
    
    void display(){
        if (courses.isEmpty()) {System.out.println("Empty course list"); return;}
        for (Course c: courses){
            System.out.println(c);
        }
    }
    
    void display(String check){
        if (courses.isEmpty()) {System.out.println("Empty course list"); return;}
        if (check.equals("O")){
            for (Course c: courses)
                if (c instanceof OnlineCourse) System.out.println(((OnlineCourse) c));
        } else{
            for (Course c: courses)
                if (c instanceof OfflineCourse) System.out.println(((OnlineCourse) c));
        }
    }
    
    boolean search(String searchName){
        
        ArrayList<Course> result = new ArrayList<>();
        for (Course c: courses){
            if (c.getCourseName().equals(searchName)) {
                result.add(c);
            }
        }
        if (result.isEmpty()) {
            return false;
        }else{
            for (Course c: result){
                if (c instanceof OnlineCourse){
                    System.out.println(((OnlineCourse) c));
                }else {
                    System.out.println(((OfflineCourse) c));
                }
            }
            return true;
        }
    }
    
    
    
}
