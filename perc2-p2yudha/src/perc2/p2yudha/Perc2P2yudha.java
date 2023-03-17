/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perc2.p2yudha;

import javax.swing.JOptionPane;

class deret {
    public int i, aw, bts, a[]= new int[30];
    public void jumlahkan (int c, int d) {
        aw = c;
        bts = d;
        a[1] = aw;
        System.out.print(a[1]+" ");
        for (i = 2; i <= 20; i++) {
            a[i]= a[i-2]+a[i-1];
            
            if (a[i]<=bts) {
                System.out.print(a[i]+" ");
            }
            System.out.print("\n");
        }
    }
}
public class Perc2P2yudha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int awal, batas;
        String nawal = JOptionPane.showInputDialog("Nilai Awal : ");
        String nbatas = JOptionPane.showInputDialog("Batas : ");
        awal = Integer.parseInt(nawal);
        batas = Integer.parseInt(nbatas);
        deret deretkan = new deret();
        deretkan.jumlahkan(awal,batas);
    }
}
