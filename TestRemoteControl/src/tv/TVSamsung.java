/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tv;


import control.Control;


public class TVSamsung implements Control {
     String[] channel = {"RCTI", "SCTV", "INDOSIAR", "ANTV", "TV7"};
     public void pindahChannel(int channel) {
         System.out.println("TV Samsung pindah channel ke " + this.channel[channel]);
     }
     public void perbesarVolume(int intensitas) {
         System.out.println("TV Samsung perbesar volume ke " + intensitas);
     }
     public void perkecilVolume(int intensitas) {
         System.out.println("TV Samsung perkecil volume ke " + intensitas);
     }
}
