/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class MatrixCalculator {
    void AddMatrix(int matrix1[][], int matrix2[][]){
        int resultMatrix[][] = new int[matrix1.length][matrix1[0].length];
        for(int i = 0; i < matrix1.length ; i++){
            for (int j = 0 ; j < matrix1[i].length; j++){
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        displayMatrix(matrix1);
        System.out.println("+");
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(resultMatrix);
    }
    
    int[][] inputMatrix(){
        int row = GetInput.checkInt("Enter row:");
        int col = GetInput.checkInt("Enter column:");
        int[][] newMatrix = new int[row][col];
        for (int i = 0 ; i < row; i++){
            for (int j = 0; j < col; j++){
                newMatrix[i][j] = GetInput.checkInt("Enter Matrix[" + (i+1) + "][" + (j+1) +"]:");
            }
        }
        return newMatrix;
    }
    
    void displayMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }
    
    void SubtractionMatrix(int matrix1[][], int matrix2[][]){
        int resultMatrix[][] = new int[matrix1.length][matrix1[0].length];
        for(int i = 0; i < matrix1.length ; i++){
            for (int j = 0 ; j < matrix1[i].length; j++){
                resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        displayMatrix(matrix1);
        System.out.println("-");
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(resultMatrix);
    }
    
    void MultiplicationMatrix(int matrix1[][], int matrix2[][]){
        int resultMatrix[][] = new int[matrix1.length][matrix1[0].length];
        for(int i = 0; i < matrix1.length ; i++){
            for (int j = 0 ; j < matrix2[0].length; j++){
                for (int k = 0; k < matrix1[0].length; k++){
                    resultMatrix[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        displayMatrix(matrix1);
        System.out.println("*");
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(resultMatrix);
    }
}
