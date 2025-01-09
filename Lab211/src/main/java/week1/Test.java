package week1;

import java.text.ParseException;
import java.util.Scanner;

public class Test extends Menu<String>{
    Scanner sc = new Scanner(System.in);
    static String[] selection = {
            "Letter and character count",
            "Linear search",
            "Conver base number",
            "Calculate equation"
    };
    
    public Test() throws ParseException {
        super("Lab week 1",selection);
    }
    
    
    @Override
    public void execute(int n) {
        switch (n){
            case 1:
                letterAndCharacterCount();
                break;
            case 2:
                linearSearch();
                break;
            case 3:
                convertBaseNumber();
                break;
            case 4:
                CalEquation();
                break;
                
        }
    }
    
    void linearSearch(){
        System.out.println("Enter number of array:");
        int number = sc.nextInt();
        
        LinearSearch linear = new LinearSearch(number);
        System.out.println("Enter search value:");
        int searchValue = sc.nextInt();
        
        linear.addValue();
        System.out.println("The array:");
        linear.showArray();
        
        int index = linear.searchValue(searchValue);
        if (index == -1) System.out.println("The value don't exist");
        else System.out.println("Found " + searchValue + " at index: " + index);
        System.out.println();
    }
    
    void letterAndCharacterCount(){
        System.out.println("Enter your content: ");
        String str = sc.nextLine();
        LetterAndCharacterCount count = new LetterAndCharacterCount(str);
        System.out.println(count.wordCount()); 
        System.out.println(count.characterCount());
        System.out.println();
    }
    
    void convertBaseNumber(){
        System.out.println("Enter base number input (1 is binary, 2 is decimal, 3 is hexadecimal)");
        int fromBase = sc.nextInt();
        System.out.println("Enter base number output (1 is binary, 2 is decimal, 3 is hexadecimal)");
        int toBase = sc.nextInt();
        System.out.println("Enter your number");
        String number = sc.next();
        BaseNumber baseConvert = new BaseNumber(fromBase, toBase, number);
        baseConvert.solve();
        System.out.println();
    }
    
    void CalEquation(){
        equationCalculate equation = new equationCalculate();
        equation.menu();
        System.out.println("");
    }
    
    public static void main(String[] args) throws ParseException {
        Test test = new Test();
        test.run();
    }
}
