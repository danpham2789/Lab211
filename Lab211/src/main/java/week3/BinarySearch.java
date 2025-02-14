/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class BinarySearch {

    int[] arr;

    public BinarySearch(int n) {
        this.arr = new int[n];
        addValue();
        Arrays.sort(arr);
    }

    public BinarySearch() {
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
    
    int binarySearch(int value){
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) return mid;
            else if (arr[mid] > value) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}
