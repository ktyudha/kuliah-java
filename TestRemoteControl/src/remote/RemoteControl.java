/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remote;

import control.Control;
import tv.*;

public class RemoteControl {
  public void kirimPerintahKeTv(int aksi, Control tv, int tombol) {  
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
