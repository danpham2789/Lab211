package week1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*System.out.println("Enter number of array:");
        int number = sc.nextInt();
        
        LinearSearch linear = new LinearSearch(number);
        System.out.println("Enter search value:");
        int searchValue = sc.nextInt();
        
        linear.addValue();
        System.out.println("The array:");
        linear.showArray();
        
        int index = linear.searchValue(searchValue);
        if (index == -1) System.out.println("The value don't exist");
        else System.out.println("Found " + searchValue + " at index: " + index);*/
        
        System.out.println("Enter your content: ");
        String str = sc.nextLine();
        LetterAndCharacterCount count = new LetterAndCharacterCount(str);
        
        count.wordCount();
        count.characterCount();
    }
}
