package week1;

import java.util.Random;

public class LinearSearch {
    private int[] array;
    
    public LinearSearch(int number) {
        this.array = new int[number];
    }
    
    void addValue() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(array.length);
        }
    }
    
    void showArray(){
        for (int num: array){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    int searchValue(int number) {
        for (int i = 0; i < array.length; i++){
            if (number == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
