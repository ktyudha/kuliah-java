/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perc6yudhap3overloading;
import java.io.*;

public class kalikan {
    public double kali(int a, int b) {
        double hasil = a*b;
        return hasil;
    }
    public double kali(double a, int b, int c) {
        double hasil = a*b+c;
        return hasil;
    }
    public double kali(int a, double b, int c, double d) {
        double hasil = a*b+c*d;
        return hasil;
    }
}
 class Perc6yudhap3overloading {

    public static void main(String[] args) {
        kalikan kl = new kalikan();
        System.out.println(kl.kali(2, 3));
        System.out.println(kl.kali(2, 3, 4));
        System.out.println(kl.kali(2, 3,4, 5));
    }
    
}
