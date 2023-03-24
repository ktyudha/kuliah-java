/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fib1yudha;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author ktyudha
 */
public class Fib1yudha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret Fibbonacci : ");
        
        int i,j;
        int n = input.nextInt();
        long fib[] = new long[n];
        
        fib[0] = 0;
        fib[1] = 1;
        
        for (i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        
        for (j = 0; j < n; j++) {
            System.out.print(fib[j]+" ");
        }
        System.out.println();
        
    }
    
}
