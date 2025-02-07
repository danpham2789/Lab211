/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;


/**
 *
 * @author Admin
 */
public class MyStack {
    int stackValues[];

    public MyStack(int[] stackValues) {
        this.stackValues = stackValues;
    }
    
    public MyStack(){
        this(new int[0]);
    }
    
    void push(int value){
        int length = stackValues.length;
        int[] temp = new int[length + 1];
        for (int i = 0 ; i < length; i++){
            temp[i] = stackValues[i];
        }
        temp[length] = value;
        stackValues = temp;
    }
    
    void pop(){
        int length = stackValues.length;
        int[] temp = new int[length - 1];
        for (int i = 0 ; i < length - 1; i++){
            temp[i] = stackValues[i];
        }
        stackValues = temp;
    }
    
    int get(){
        return stackValues[stackValues.length - 1];
    }
    
    void display(){
        for (int i:stackValues){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
