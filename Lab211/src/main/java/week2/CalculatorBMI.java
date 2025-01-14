package week2;

public class CalculatorBMI {

    public CalculatorBMI() {
    }
    
    double calculator(double num1, char operator, double num2){
        switch (operator){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '^':
                return Math.pow(num1, num2);
            default:
                return 0;
        }
    }
    
    void BMICalculate(double weight, double height){
        double BMI = weight / (height*height);
        System.out.println("BMI: " + BMI);
        if (BMI < 19) System.out.println("Under-Standard");
        else if (BMI <= 25) System.out.println("Standard");
        else if (BMI <= 30) System.out.println("Oveweight");
        else if (BMI <= 40) System.out.println("Fat - should lose weight");
        else System.out.println("Very fat - should lose weight immediately");
    }
}
