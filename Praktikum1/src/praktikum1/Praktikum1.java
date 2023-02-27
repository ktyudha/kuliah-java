/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum1;

import java.io.*;
//import java.net.*;
//import java.awt.event.*;
//import javax.swing.*;
/**
 *
 * @author ktyudha
 */
public class Praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        BufferedReader object = new BufferedReader (new InputStreamReader(System.in));
        try {
            System.out.print("Input X:");
            int x = Integer.parseInt(object.readLine());
             System.out.print("Input Y:");
            int y = Integer.parseInt(object.readLine());
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.print("Pilihan:");
            int a = Integer.parseInt(object.readLine());
            
            switch(a){
                case 1:
                    System.out.println("Memasukkan nomer satu =" + (x+y));
                    break;
                case 2:
                    System.out.println("Memasukkan nomer dua =" + (x-y));
                    break;
                case 3:
                    System.out.println("Memasukkan nomer tiga =" + (x*y));
                    break;
                case 4:
                    System.out.println("Memasukkan nomer empat =" + (x/y));
                    break;
                default:
                    System.out.print("Masukkan salah!");
            }
        }
        catch(NumberFormatException ne) {
            System.out.println(ne.getMessage() + "Input Salah...!");
            System.exit(0);
        }
    }
    
}
