/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fib2yudha;
import java.io.*;
import java.util.Scanner;

public class Fib2yudha {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n = scanner.nextInt();

        int[][] pascalArray = new int[n][n];
        
        for (int i = 0; i < n; i++) {           
            for (int k = 0; k < n - i; k++) 
           {
                System.out.print(" ");
            }
           for (int j = 0; j <= i; j++) 
            {
                if (j == 0 || j == i) 
                {
                    pascalArray[i][j] = 1;
                } 
                else 
                {
                    pascalArray[i][j] = pascalArray[i - 1][j - 1] + pascalArray[i - 1][j];
                }
                System.out.print(pascalArray[i][j] + " ");
            }
            System.out.println();
        }
    }   
}
