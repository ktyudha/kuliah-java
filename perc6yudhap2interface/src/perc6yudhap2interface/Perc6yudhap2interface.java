/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perc6yudhap2interface;
import java.util.Scanner;
import java.io.*;

interface Control {
    public void pindahChannel(int channel);
    public void perbesarVolume(int intensitas);
    public void perkecilVolume(int intensitas);
}

class TVPolitron implements Control {
    String[] channel = {"RCTI", "SCTV", "INDOSIAR", "ANTV", "TV7"};
    public void pindahChannel(int channel){
        System.out.println("TV Politron pindah channnel ke " + this.channel[channel]);
    }
    public void perbesarVolume(int intensitas) {
        System.out.println("TV Politron perbesar channnel ke " + intensitas);
    }
    public void perkecilVolume(int intensitas) {
        System.out.println("TV Politron perkecil channnel ke " + intensitas);
    }
}

class TVSamsung implements Control {
    String[] channel = {"RCTI", "SCTV", "INDOSIAR", "ANTV", "TV7"};
    public void pindahChannel(int channel){
        System.out.println("TV Samsung pindah channnel ke " + this.channel[channel]);
    }
    public void perbesarVolume(int intensitas) {
        System.out.println("TV Samsung perbesar channnel ke " + intensitas);
    }
    public void perkecilVolume(int intensitas) {
        System.out.println("TV Samsung perkecil channnel ke " + intensitas);
    }
} 

class RemoteControl {
    public void kirimPerintahKeTv(int aksi, Control tv, int tombol){
        switch(aksi) {
            case 1:
                tv.pindahChannel(tombol);
                break;
            case 2:
                tv.perbesarVolume(tombol);
                break;
            case 3:
                tv.perkecilVolume(tombol);
                break;
        }
    }
}
public class Perc6yudhap2interface {

 
    public static void main(String[] args) {
        TVPolitron tvp = new TVPolitron();
        TVSamsung tvs = new TVSamsung();
        RemoteControl rc = new RemoteControl();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilihan Kanal[1], Volume [2-3] : ");
        int ch = scanner.nextInt();
        System.out.println("Jenis TV [1-2] : ");
        int mtv = scanner.nextInt();
        System.out.println("Nomer Kanal/Volume [0-4] : ");
        int vl = scanner.nextInt();
        
        switch(mtv) {
            case 1:
                rc.kirimPerintahKeTv(ch, tvp, vl);
                break;
            case 2:
                 rc.kirimPerintahKeTv(ch, tvs, vl);
                break;
        }
    }
    
}
