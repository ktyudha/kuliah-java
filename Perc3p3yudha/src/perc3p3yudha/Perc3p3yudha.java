/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perc3p3yudha;
import javax.swing.JOptionPane;

class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear =1;
    
    void changeCadence(int newValue) {
        cadence= newValue;
    }
    void changeGear(int newValue) {
        gear = newValue;
    }
    void speedUp(int increment) {
        speed = speed + increment;
    }
    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    void printStates(){
        System.out.println("cadence: " + cadence + ", speed: " + speed + ", gear: " + gear);
    }
}
class Perc3p3yudha {
    public static void main(String[] args) {
        int icadence,igear,ispeed,ibrake;
        
        String nicadence = JOptionPane.showInputDialog("Cadence : ");
        String nigear = JOptionPane.showInputDialog("Gear : ");
        String nispeed = JOptionPane.showInputDialog("Speed : ");
        String nibrake = JOptionPane.showInputDialog("Rem : ");
        
        icadence = Integer.parseInt(nicadence);
        igear = Integer.parseInt(nigear);
        ispeed = Integer.parseInt(nispeed);
        ibrake = Integer.parseInt(nibrake);
        
        Bicycle bicObj = new Bicycle();
        bicObj.changeCadence(icadence);
        bicObj.changeGear(igear);
        bicObj.speedUp(ispeed);
        bicObj.applyBrakes(ibrake);
        bicObj.printStates();
    }
}
