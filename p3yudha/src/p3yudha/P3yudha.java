/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p3yudha;
import javax.swing.JOptionPane;

class Tabungan {
    public int saldo;
    public Tabungan(int initSaldo){
        saldo=initSaldo;
    }
    public void ambilUang(int jumlah) {
        saldo=saldo-jumlah;
    }
}

public class P3yudha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilaiAmbil;
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("saldo awal:"+tabungan.saldo);
        String ambil=JOptionPane.showInputDialog("masukkan jumlah pengambilan: ");
        nilaiAmbil = Integer.parseInt(ambil);
        tabungan.ambilUang(nilaiAmbil);
        System.out.println("jumlah pengambilan: "+nilaiAmbil);
        System.out.println("Saldo sekarang: "+tabungan.saldo);
    }
    
}
