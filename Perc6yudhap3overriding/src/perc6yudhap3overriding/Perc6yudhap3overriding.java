/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perc6yudhap3overriding;
import java.io.*;

class Hewan {
    public Hewan(){
        System.out.println("Hewan Bisa Berjalan");
    }
}

class Kucing extends Hewan {
    public Kucing() {
        System.out.println("Kucing bisa Memanjat");
    }
}

class Macan extends Kucing {
    public Macan() {
        System.out.println("Macan Bisa Berenang");
    }
}
public class Perc6yudhap3overriding {

    public static void main(String[] args) {
        Hewan a = new Macan();
    }
    
}
