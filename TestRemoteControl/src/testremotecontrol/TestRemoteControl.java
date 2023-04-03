/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testremotecontrol;
import java.util.Scanner;
import remote.RemoteControl;
import tv.*;
import control.Control;


public class TestRemoteControl {

    public static void main(String[] args) {
       TVPolitron tvp = new TVPolitron();
       TVSamsung tvs = new TVSamsung();
       RemoteControl rc = new RemoteControl();
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Pilihan Kanal[1], Volume [2-3] : ");
       int ch = scanner.nextInt();
       System.out.print("Jennis tv [1-2] : ");
       int mtv = scanner.nextInt();
       System.out.print("Nomer Kanal/Volume [0-4] : ");
       int vl = scanner.nextInt();
       
       switch(mtv) {
           case 1:
               rc.kirimPerintahKeTv(ch,tvp,vl);
               break;
           case 2:
               rc.kirimPerintahKeTv(ch,tvs,vl);
               break;
       }
    }
}
