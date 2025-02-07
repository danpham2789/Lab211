/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class QuickSort {
    int[] arr;

    public QuickSort(int n) {
        this.arr = new int[n];
        addValue();
    }

    
    void addValue() {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(arr.length);
        }
    }
    
    void display(){
        for (int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    int partition(int left, int right){
        int pivot = arr[right];
        int j = left;
        
        for (int i = left; i < right; i++ ){
            if (arr[i] < pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        
        int temp = arr[j];
        arr[j] = arr[right];
        arr[right] = temp;
        
        return j;
    }
    
    void qSort(int left, int right) {
        if (left > right) return;
        int pivot = partition(left, right);
        qSort(left, pivot - 1);
        qSort(pivot + 1, right);
        
    }
    
    void sort(){
        qSort(0, arr.length - 1);
    }
}
