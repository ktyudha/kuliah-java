/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metnum1;
import javax.swing.*;
/**
 *
 * @author ktyudha
 */
public class MetNum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String a = JOptionPane.showInputDialog("Silahkan Masukkan Basis");
        int n = Integer.parseInt(a);
        String b = JOptionPane.showInputDialog("Masukkan Panjang Digit");
        int N = Integer.parseInt(b);
        
        int hasil = 0;
        for (int i=1; i<=N; i++){
            String C = JOptionPane.showInputDialog("Masukkan Digit ke "+i);
            int ca = Integer.parseInt(C);
            hasil = ca + hasil * n;
            
            if (i==N)
            System.out.println("Desimal = " + hasil);
            
        
        
    }
    }
    
}
