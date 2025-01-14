/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
    static void doCalculate(){
        CalculatorBMI cal = new CalculatorBMI();
        int choice = 0;
        while (choice != 3){
            System.out.printf("========= Calculator Program =========\n" +
                                "1. Normal Calculator\n" +
                                "2. BMI Calculator\n" +
                                "3. Exit\n");
            choice = GetInput.checkInt("Please choice one option:", 3);
            switch(choice) {
                case 1:
                    double memory = 0,num;
                    char operator = '.';
                    while (operator != '='){
                        if (memory == 0) memory = GetInput.checkDouble("Enter number: ");
                        operator = GetInput.checkOperator("Enter operator: ");
                        num = GetInput.checkDouble("Enter number: ");
                        memory = cal.calculator(memory, operator, num);
                        System.out.println("Memory: " + memory);
                }
                    System.out.println("Result: " + memory);
                    break;
                case 2:
                    double height,weight;
                    height = GetInput.checkDouble("Enter height: ");
                    weight = GetInput.checkDouble("Enter weight: ");
                    cal.BMICalculate(weight, height);
            }
        }
    }
    
    public static void main(String[] args) {
        doCalculate();
    }
}
