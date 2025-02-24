/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author Admin
 */
public class Teacher extends Person{
    private int yearProfession;
    private String contractType;
    private double salary;

    public Teacher() {
        super();
        this.yearProfession = 0;
        this.contractType = "";
        this.salary = 0;
    }
    
    void inputAll(){
        super.inputAll();
        setYearProfession(GetInput.checkInt("Enter year profession: ", super.getYob() - 1));
        setContractType(GetInput.check("Entet contract type: ", "Long", "Short"));
        setSalary(GetInput.checkDouble("Enter salary: "));
    }

    public int getYearProfession() {
        return yearProfession;
    }

    public void setYearProfession(int yearProfession) {
        this.yearProfession = yearProfession;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", yearProfession=" + yearProfession + ", contractType=" + contractType + ", salary=" + salary;
    }

    
    
}
