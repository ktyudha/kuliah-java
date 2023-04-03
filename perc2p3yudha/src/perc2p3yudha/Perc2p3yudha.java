/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perc2p3yudha;
import javax.swing.JOptionPane;
class fibonacci {
    public int i, j, k, hasil;
    public void lambda (int b) {
       
        System.out.print("x\t");
        for (i = 1; i <= b; i++) {
                System.out.print(i+"\t");        
        }
        System.out.println();
        
        for (j = 1; j <= b; j++) {
              System.out.print(j+ "\t"); 
              
              for (k = 1; k <= b; k++) {
                hasil = j*k;
                  System.out.print(hasil+ "\t");
            }
              System.out.print("\n");
        } 
    }
}

public class Perc2p3yudha {
    
    public static void main(String[] args) {
        int batas;
        String nbatas = JOptionPane.showInputDialog("Batas Perkalian : ");
        batas = Integer.parseInt(nbatas);
        fibonacci fibbonacikan = new fibonacci();
        fibbonacikan.lambda(batas);
    }
    
}
