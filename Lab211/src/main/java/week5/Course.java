/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author Admin
 */
public class Course {
    private String courseID;
    private String courseName;
    private int credit;

    public Course() {
        courseID = "";
        courseName = "";
        credit = 0;
    }
    
    void inputAll(String id, String name, int cr){
        courseID = id;
        courseName = name;
        credit = cr;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "courseID=" + courseID + ", courseName=" + courseName + ", credit=" + credit;
    }
    
    
    
}
