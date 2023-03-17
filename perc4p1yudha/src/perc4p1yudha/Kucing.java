/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perc4p1yudha;

import java.io.*;
/**
 *
 * @author ktyudha
 */

public class Kucing {
    public int a = 5;
    protected int b = 7;
    
    public void info1() {
        System.out.println("a = " +a);
        System.out.println("b = "+b);
    }
}

class Jinak extends Kucing {
    private int c = 9;
    public void info2() {
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}

class Turunan {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kucing coba1 = new Kucing();
        coba1.info1();
        
        Jinak coba2 = new Jinak();
        coba2.info2();
    }
}
