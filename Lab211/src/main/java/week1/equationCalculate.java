package week1;

import java.util.Scanner;


public class equationCalculate {
    private double a;
    private double b;
    private double c;

    public equationCalculate() {
    }
    
    public equationCalculate(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public equationCalculate(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    void menu(){
        System.out.println("========= Equation Program =========\n" +
                        "1. Calculate Superlative Equation\n" +
                        "2. Calculate Quadratic Equation\n" +
                        "3. Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                this.a = GetInput.checkDouble("Enter A: ");
                this.b = GetInput.checkDouble("Enter B: ");
                equationCal();
                break;
            case 2:
                this.a = GetInput.checkDouble("Enter A: ");
                this.b = GetInput.checkDouble("Enter B: ");
                this.c = GetInput.checkDouble("Enter C: ");
                quadraticEquationCal();
                break;
            case 3:
                break;
        }
        
    }
    
    void equationCal(){
        double x = -b / a;
        System.out.println("Solution: x = " + x);
        System.out.print("Odd number: ");
        if (a % 2 == 0) System.out.print(a + " ");
        if (b % 2 == 0) System.out.print(b + " ");
        System.out.println("Even number: ");
        if (a % 2 == 0) System.out.print(a + " ");
        if (b % 2 == 0) System.out.print(b + " ");
        System.out.print("Perfect square number: ");
        if (Math.sqrt(a) == (int)Math.sqrt(a)) System.out.print(a + " ");
        if (Math.sqrt(b) == (int)Math.sqrt(b)) System.out.print(b + " ");
        
    }
    
    void quadraticEquationCal(){
        double delta = b*b - 4*a*c;
        double x1,x2;
        if (delta < 0) System.out.println("No solution");
        else if (delta == 0) {
            x1 = -b / (2*a);
            x2 = x1;
            System.out.println("x1 = x2 = " + x1);
        }
        else 
        {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }
        
        System.out.print("Odd number: ");
        if (a % 2 == 0) System.out.print(a + " ");
        if (b % 2 == 0) System.out.print(b + " ");
        if (c % 2 == 0) System.out.print(c + " ");
        System.out.println("Even number: ");
        if (a % 2 != 0) System.out.print(a + " ");
        if (b % 2 != 0) System.out.print(b + " ");
        if (c % 2 != 0) System.out.print(c + " ");
        System.out.print("Perfect square number: ");
        if (Math.sqrt(a) == (int)Math.sqrt(a)) System.out.print(a + " ");
        if (Math.sqrt(b) == (int)Math.sqrt(b)) System.out.print(b + " ");
        if (Math.sqrt(c) == (int)Math.sqrt(c)) System.out.print(c + " ");
    }
    
}
