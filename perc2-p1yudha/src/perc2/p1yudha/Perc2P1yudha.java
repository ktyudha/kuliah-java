/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perc2.p1yudha;

import java.io.*;
/**
 *
 * @author ktyudha
 */

class Parent {
    public int x = 5;
}

class Child extends Parent {
    public int x = 10;
    public void Info(int x) {
        System.out.println("Nilai x sebagai parameter = " + x);
        System.out.println("Nilai x di class Child = " + this.x);
        System.out.println("Nilai x di class Parent " + super.x);
    }
}
public class Perc2P1yudha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Child coba = new Child();
        coba.Info(30);
    }
    
}
