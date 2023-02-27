/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum2;
import javax.swing.JOptionPane;
/**
 *
 * @author ktyudha
 */
public class Praktikum2 {

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]){
    int tabungan = 5000;
    int ambil, saldo;
    System.out.println("saldo awal:"+ tabungan);
    String amb = JOptionPane.showInputDialog("masukkan jumlah pengambilan: ");
    ambil=Integer.parseInt(amb);
    System.out.println("Jumlah pengambilan:"+ ambil);
    saldo=tabungan-ambil;
    
    System.out.println("saldo sekarang: "+saldo);
}
    
}
