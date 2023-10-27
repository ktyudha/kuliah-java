/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriks;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author ktyudha
 */
public class Matriks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
         Scanner scanner = new Scanner(System.in);
//         System.out.println("Masukkan kolom");
//              int kolom = scanner.nextInt();
         System.out.println("Masukkan baris");
//          int baris = scanner.nextInt();
int kolom = 3;
int baris = 3;
        int[][] a = new int[kolom][baris];
        
       
        for (int i = 0; i < kolom; i++) { 
            for (int j = 0; j < 3; j++) {
                System.out.println("elemen["+(i)+","+(j)+"] = ");
                a[i][j]=Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Matriks \n");
        for (int k = 0; k < baris; k++) {
            for (int l = 0; l < baris; l++) {
                System.out.print(a[k][l]+" ");
            }
            System.out.println();
        }
        int dtr = ((a[0][0]*a[1][1]*a[2][2])+(a[0][1]*a[1][2]*a[2][0])+(a[0][2]*a[1][0]*a[2][1]))-((a[0][2]*a[1][1]*a[2][0])+(a[0][0]*a[1][2]*a[2][1])+(a[0][1]*a[1][0]*a[2][2]));
            System.out.println("Hasil determinan ="+dtr);
//            for (int k = 0; k < kolom - i; k++) 
//           {
//                System.out.print(" ");
//            }
//           for (int j = 0; j <= i; j++) 
//            {
//                if (j == 0 || j == i) 
//                {
//                    pascalArray[i][j] = 1;
//                } 
//                else 
//                {
//                    pascalArray[i][j] = pascalArray[i - 1][j - 1] + pascalArray[i - 1][j];
//                }
//                System.out.print(pascalArray[i][j] + " ");
//            }
//            System.out.println();
        
        
    }
    
}
