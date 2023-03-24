/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perc4p3yudha;
import java.io.*;


public class Encapsulasi {
    private String name;
    private String idNum;
    private int age;
    
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getIdNum() {
        return idNum;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setIdNum(String newId){
        idNum = newId;
    }
    
}
class LatEncapsulasi {

    public static void main(String[] args) {

        Encapsulasi encap = new Encapsulasi();
        encap.setName("Kurniawan Try Yudha");
        encap.setAge(20);
        encap.setIdNum("2222500003");
        System.out.println("Nama : " + encap.getName() +
           ", Umur : " + encap.getAge() + ", ID : " + encap.getIdNum());
    }
    
}
