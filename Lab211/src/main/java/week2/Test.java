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
    
    static void matrixCal(){
        MatrixCalculator matrix = new MatrixCalculator();
        int choice = 0;
        while (choice != 4){
            System.out.printf("========Calculator program=========\n" + 
                            "1. Addition matrix\n" + 
                            "2. Subtraction matrix\n" +
                            "3. Multiplication matrix\n" +
                            "4. Quit\n");
            choice = GetInput.checkInt("Enter your choice", 4);
            int[][] newMatrix1 = null;
            int[][] newMatrix2 = null;
            switch(choice){
                case 1:
                    System.out.println("=======Addition======");
                    
                    do{
                        newMatrix1 = matrix.inputMatrix();
                        newMatrix2 = matrix.inputMatrix();
                    }while(newMatrix1.length != newMatrix2.length || newMatrix1[0].length != newMatrix2[0].length);
                    matrix.AddMatrix(newMatrix1, newMatrix2);
                    break;
                case 2:
                    System.out.println("=======Subtraction======");
                    do{
                        newMatrix1 = matrix.inputMatrix();
                        newMatrix2 = matrix.inputMatrix();
                    }while(newMatrix1.length != newMatrix2.length || newMatrix1[0].length != newMatrix2[0].length);
                    matrix.SubtractionMatrix(newMatrix1, newMatrix2);
                    break;
                case 3:
                    System.out.println("=======Subtraction======");
                    do{
                        newMatrix1 = matrix.inputMatrix();
                        newMatrix2 = matrix.inputMatrix();
                    }while(newMatrix1[0].length != newMatrix2.length);
                    matrix.MultiplicationMatrix(newMatrix1, newMatrix2);
                    break;
            }
        }
    }
    
    static void areaCalculate(){
        double width = GetInput.checkDouble("Please input side width of Rectangle:");
        double length = GetInput.checkDouble("Please input length of Rectangle:");
        double radius = GetInput.checkDouble("Please input radius of Circle:");
        double a = GetInput.checkDouble("Please input side A of Triangle:");
        double b = GetInput.checkDouble("Please input side B of Triangle:");
        double c = GetInput.checkDouble("Please input side C of Triangle:");
        Rectangle rectangle = new Rectangle(width, length);
        Circle circle = new Circle(radius);
        Triangle triangle = new Triangle(a,b,c);
        
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }
    
    public static void main(String[] args) {
        //doCalculate();
        //matrixCal();
        areaCalculate();
    }
}
