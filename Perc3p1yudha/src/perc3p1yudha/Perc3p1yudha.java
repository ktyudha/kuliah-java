/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perc3p1yudha;
import java.io.*;

class Superclass {
    int a;
    void display_a(){
        System.out.println("a = " + a);
    }
}

class Subclass extends Superclass {
    int a;
    void display_a(){
        System.out.println("a = " + a);
    }
    void set_super_a(int n){
        super.a = n;
    }
    void display_super_a(){
        super.display_a();
    }
}

public class Perc3p1yudha {

    public static void main(String[] args) {
        Superclass SuperObj = new Superclass();
        Subclass SubObj = new Subclass();
        SuperObj.a = 1;
        SubObj.a = 2;
        SubObj.set_super_a(3);
        SuperObj.display_a();
        SubObj.display_a();
        SubObj.display_super_a();
        System.out.println(SubObj.a);
    }
}
