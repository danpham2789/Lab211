/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author Admin
 */
public class Test {

    
    public static void main(String[] args) {
//        
//        int n = GetInput.checkInt("Enter number of array");
//        BubbleSort bubble = new BubbleSort(n);
//        System.out.println("Unsorted array");
//        bubble.display();
//        bubble.Sort();
//        System.out.println("Sorted array");
//        bubble.display();
//        
//        MyStack stack = new MyStack();
//        stack.push(0);
//        stack.push(1);
//        stack.push(4);
//        stack.display();
//        stack.pop();
//        stack.display();
//        System.out.println(stack.get());

//        int n = GetInput.checkInt("Enter number of array");
//        QuickSort sort = new QuickSort(n);
//        sort.display();
//        sort.sort();
//        sort.display();

        int n = GetInput.checkInt("Enter number of array");
        int value = GetInput.checkInt("Enter search value");
        BinarySearch search = new BinarySearch(n);
        search.display();
        int result = search.binarySearch(value);
        if (result == -1) System.out.println("Not found");
        else System.out.println("Found " + value + " at index: " + result);
    }
}
