/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perc4p2yudha;
import java.io.*;
/**
 *
 * @author ktyudha
 */

public class Kucing {
    public void aksi() {
        System.out.println("Kucing bisa memanjat ...");
    }
}

class Macan extends Kucing{
     public void aksi() {
        System.out.println("Macan bisa Berenang ...");
    }
}

class Singa extends Kucing{
     public void aksi() {
        System.out.println("Singa hidup Berkelompok ...");
    }
}

class Cheetah extends Kucing{
     public void aksi() {
        System.out.println("Cheetah bisa berlari cepat");
    }
}
class TestKucing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kucing kc = new Kucing();
        kc.aksi();
        
        kc = new Macan();
        kc.aksi();
        
        kc = new Singa();
        kc.aksi();
        
        kc = new Cheetah();
        kc.aksi();
    }
    
}
