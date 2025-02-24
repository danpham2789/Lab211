/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author Admin
 */
public class OnlineCourse extends Course{
    protected String platform;
    protected String instructors;
    protected String note;

    public OnlineCourse() {
        super();
        platform = "";
        instructors = "";
        note = "";
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructors() {
        return instructors;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    void inputAll(String id, String name, int cr, String platform, String instructors, String note){
        super.inputAll(id, name, cr);
        this.platform = platform;
        this.instructors = instructors;
        this.note = note;
    }

    @Override
    public String toString() {
        return super.toString() + ", platform=" + platform + ", instructors=" + instructors + ", note=" + note;
    }
    
    
    
}
