/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.time.Year;

/**
 *
 * @author Admin
 */
public class Student2 extends Person{
    private int yearOfAdmission;
    private int entranceEnglishScore;

    public Student2() {
        super();
        this.yearOfAdmission = 0;
        this.entranceEnglishScore = 0;
    }

    void inputAll(){
        super.inputAll();
        while (true){
            int year = GetInput.checkInt("Enter year of admssion: ", Year.now().getValue());
            if (year >= super.getYob()) {setYearOfAdmission(year); break;}
            else System.out.println("Invalid year");
        }
        setEntranceEnglishScore(GetInput.checkInt("Enter entrance english score: ", 101));
    }
    
    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public int getEntranceEnglishScore() {
        return entranceEnglishScore;
    }

    public void setEntranceEnglishScore(int entranceEnglishScore) {
        this.entranceEnglishScore = entranceEnglishScore;
    }

    @Override
    public String toString() {
        return super.toString() + ", yearOfAdmission=" + yearOfAdmission + ", entranceEnglishScore=" + entranceEnglishScore;
    }
    
    
}
